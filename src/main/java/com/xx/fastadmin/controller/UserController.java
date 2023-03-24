package com.xx.fastadmin.controller;

import com.github.pagehelper.PageInfo;
import com.xx.fastadmin.domain.User;
import com.xx.fastadmin.domain.query.UserQuery;
import com.xx.fastadmin.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xx
 * @date 2023/3/24
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户接口管理", tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("根据条件分页查询用户列表")
    @PostMapping("/list")
    public ResponseEntity<PageInfo<User>> selectUserList(@RequestBody UserQuery userQuery){
        PageInfo<User> pageInfo = userService.selectUserList(userQuery);
        return ResponseEntity.ok().body(pageInfo);
    }

}
