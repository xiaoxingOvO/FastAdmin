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
     * @param userQuery 用户查询参数
     * @return 用户列表
     */
    @ApiOperation("根据条件分页查询用户列表")
    @PostMapping("/list")
    public ResponseEntity<Object> queryUsers(@RequestBody UserQuery userQuery){
        PageInfo<User> pageInfo = userService.selectUserList(userQuery);
        return ResponseEntity.ok().body(pageInfo);
    }

    /**
     * 根据id查询详情
     * @param id 用户id
     * @return 用户详情
     */
    @ApiOperation("根据id查询详情")
    @GetMapping("/{id}")
    public ResponseEntity<Object> detailUser(@PathVariable("id") Long id){
        User user = userService.selectById(id);
        return ResponseEntity.ok().body(user);
    }

    /**
     * 根据id批量删除
     * @param ids 用户ids
     * @return 返回成功信息
     */
    @DeleteMapping("/batch")
    public ResponseEntity<Object> deleteUsers(@RequestBody List<Long> ids){
        userService.deleteUsers(ids);
        return ResponseEntity.ok().body("删除成功");
    }

    /**
     * 新增用户
     * @param user 用户对象
     * @return 返回成功信息
     */
    @PostMapping("")
    public ResponseEntity<Object> createUser(@RequestBody User user){
        userService.createUser(user);
        return ResponseEntity.ok().body("新增成功");
    }

    /**
     * 更新用户
     * @param user 用户对象
     * @return 返回成功信息
     */
    @PutMapping("/")
    public ResponseEntity<Object> updateUser(@RequestBody User user){
        userService.updateUser(user);
        return ResponseEntity.ok().body("更新成功");
    }



}
