package com.xx.fastadmin.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xx
 * @date 2023/3/24
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户管理接口",consumes = "用户管理接口")
public class UserController {
}
