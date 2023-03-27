package com.xx.fastadmin.controller;

import com.github.pagehelper.PageInfo;
import com.xx.fastadmin.domain.User;
import com.xx.fastadmin.domain.query.UserQuery;
import com.xx.fastadmin.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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

    /**
     * 根据条件分页查询用户列表
     * @param userQuery
     * @return
     */
    @ApiOperation("根据条件分页查询用户列表")
    @PostMapping("/list")
    public ResponseEntity<PageInfo<User>> queryUsers(@RequestBody UserQuery userQuery){
        PageInfo<User> pageInfo = userService.selectUserList(userQuery);
        return ResponseEntity.ok().body(pageInfo);
    }

    /**
     * 根据id查询详情
     * @param id
     * @return
     */
    @ApiOperation("根据id查询详情")
    @GetMapping("/{id}")
    public ResponseEntity detailUser(@PathVariable("id") Long id){
        User user = userService.selectById(id);
        return ResponseEntity.ok().body(user);
    }

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    @DeleteMapping("/batch{id}")
    public ResponseEntity deleteUsers(@RequestBody List<Long> ids){
        String s = userService.deleteUsers(ids);

        return null;
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("")
    public ResponseEntity createUser(@RequestBody User user){
        String s = userService.createUser(user);
        return null;
    }

    /**
     * 更新用户
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable("id") Long id,@RequestBody User user){
        String s = userService.updateUser(user);
        return null;
    }



}
