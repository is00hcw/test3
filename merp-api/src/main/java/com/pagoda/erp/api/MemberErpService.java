package com.pagoda.erp.api;

import com.pagoda.erp.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * 会员1服务接口MemberErpService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Api(value = "MemberErp", description = "MemberErp api")
public interface MemberErpService extends Remote, BaseMemberErpService {}
