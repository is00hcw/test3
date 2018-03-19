FROM java:8
VOLUME /tmp
ADD target/bgkj-web-1.2.0.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080
#ENV JAVA_OPTS="\
#-server \
#-Xmx4g \
#-Xms4g \
#-Xmn2g \
#-XX:SurvivorRatio=8 \
#-XX:MetaspaceSize=256m \
#-XX:MaxMetaspaceSize=512m \
#-XX:+UseParallelGC \
#-XX:ParallelGCThreads=4 \
#-XX:+UseParallelOldGC \
#-XX:+UseAdaptiveSizePolicy \
#-XX:+PrintGCDetails \
#-XX:+PrintTenuringDistribution \
#-XX:+PrintGCTimeStamps \
#-XX:+HeapDumpOnOutOfMemoryError \
#-XX:HeapDumpPath=/ \
#-Xloggc:/gc.log \
#-XX:+UseGCLogFileRotation \
#-XX:NumberOfGCLogFiles=5 \
#-XX:GCLogFileSize=10M"
ENTRYPOINT ["java","${JAVA_OPTS}", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


# https://segmentfault.com/a/1190000007271728
# -e "JAVA_OPTS=-Dspring.profiles.active=demo"