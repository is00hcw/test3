package com.pagoda.bgkj.api;

import com.pagoda.bgkj.api.dto.*;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * 成员服务接口MemberService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Api(value = "Member", description = "Member api")
public interface MemberService extends Remote, BaseMemberService {}
