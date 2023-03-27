package com.xx.fastadmin.mapper;

import com.xx.fastadmin.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xx.fastadmin.domain.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author xiaoxing
* @description 针对表【user(用户信息表)】的数据库操作Mapper
* @createDate 2023-03-24 10:51:09
* @Entity com.xx.fastadmin.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据条件分页查询用户列表
     * @param userQuery
     * @return
     */
    List<User> selectUserList(UserQuery userQuery);

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
    int insertUser(User user);


    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据id批量查询用户
     * @param ids
     * @return
     */
    List<User> selectByIds(List<Long> ids);

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    int deleteUsers(List<Long> ids);

}




