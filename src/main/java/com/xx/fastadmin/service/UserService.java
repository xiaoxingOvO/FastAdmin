package com.xx.fastadmin.service;

import com.github.pagehelper.PageInfo;
import com.xx.fastadmin.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xx.fastadmin.domain.query.UserQuery;

import java.util.List;


/**
* @author xiaoxing
* @description 针对表【user(用户信息表)】的数据库操作Service
* @createDate 2023-03-24 10:51:09
*/
public interface UserService extends IService<User> {

    /**
     * 根据条件分页查询用户
     * @param userQuery
     * @return
     */
    PageInfo<User> selectUserList(UserQuery userQuery);

    /**
     * 根据id查询详情
     * @param id
     * @return
     */
    User selectById(Long id);

    /**
     * 新增用户
     * @param user
     * @return
     */
    String createUser(User user);


    /**
     * 修改用户
     * @param user
     * @return
     */
    String updateUser(User user);

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    String deleteUsers(List<Long> ids);


}
