package com.project.test.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.util.ErrorHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

/**
 * Redis缓存配置类，推荐使用org.springframework.data.redis.support包下面封装好的集合类
 *
 * @author PagodaGenerator generated
 */
@Configuration
@ConditionalOnClass({JedisConnection.class, RedisOperations.class})
@Slf4j
public class RedisConfiguration {

  /**
   * 配置redis序列化
   *
   * @param connectionFactory
   * @return
   */
  @Bean
  @ConditionalOnMissingBean
  public StringRedisTemplate redisTemplate(RedisConnectionFactory connectionFactory) {
    StringRedisTemplate template = new StringRedisTemplate(connectionFactory);
    Jackson2JsonRedisSerializer jackson2JsonRedisSerializer =
        new Jackson2JsonRedisSerializer(Object.class);
    ObjectMapper om = new ObjectMapper();
    om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    jackson2JsonRedisSerializer.setObjectMapper(om);
    template.setHashKeySerializer(jackson2JsonRedisSerializer);
    template.setHashValueSerializer(jackson2JsonRedisSerializer);
    return template;
  }

  /**
   * 使用redis pub-sub，需要先注册 container.addMessageListener(listener, topic)
   *
   * @param connectionFactory
   * @return
   */
  @Bean
  @ConditionalOnMissingBean
  public RedisMessageListenerContainer redisMessageListenerContainer(
      RedisConnectionFactory connectionFactory) {
    RedisMessageListenerContainer container = new RedisMessageListenerContainer();
    container.setConnectionFactory(connectionFactory);
    container.setErrorHandler(
        new ErrorHandler() {
          @Override
          public void handleError(Throwable throwable) {
            log.error("redisMessageListenerContainer | err=" + throwable.getMessage(), throwable);
          }
        });
    return container;
  }
}
