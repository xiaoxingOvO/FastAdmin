package com.xx.fastadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xx.fastadmin.domain.User;
import com.xx.fastadmin.service.UserService;
import com.xx.fastadmin.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author xiaoxing
* @description 针对表【user(用户信息表)】的数据库操作Service实现
* @createDate 2023-03-24 10:51:09
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




