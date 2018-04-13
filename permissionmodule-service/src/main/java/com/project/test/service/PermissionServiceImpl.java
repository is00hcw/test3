package com.project.test.service;

import com.project.test.service.base.*;
import com.pagoda.platform.jms.jpa.*;
import com.project.test.api.*;
import com.project.test.api.dto.*;
import com.project.test.domain.*;
import com.project.test.repo.*;

import io.swagger.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.validation.annotation.Validated;

/**
 * 权限服务实现类PermissionServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PermissionServiceImpl extends BasePermissionServiceImpl {}
