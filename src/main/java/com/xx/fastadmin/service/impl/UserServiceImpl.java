package com.xx.fastadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xx.fastadmin.domain.User;
import com.xx.fastadmin.domain.query.UserQuery;
import com.xx.fastadmin.service.UserService;
import com.xx.fastadmin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author xiaoxing
* @description 针对表【user(用户信息表)】的数据库操作Service实现
* @createDate 2023-03-24 10:51:09
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据条件分页查询用户
     * @param userQuery
     * @return
     */
    @Override
    public PageInfo<User> selectUserList(UserQuery userQuery) {
//        Page<User> page = PageHelper.startPage(1, 10);
//        List<User> users = userMapper.selectUserList(userQuery);
//        Page<User> page = PageHelper.startPage(1, 10).doSelectPage(() -> userMapper.selectUserList(userQuery));
        PageInfo<User> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(() -> userMapper.selectUserList(userQuery));
        return pageInfo;
    }
}




