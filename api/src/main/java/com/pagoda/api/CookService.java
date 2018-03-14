package com.pagoda.api;

import com.pagoda.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * cook服务接口CookService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Api(value = "Cook", description = "Cook api")
public interface CookService extends Remote, BaseCookService {}
