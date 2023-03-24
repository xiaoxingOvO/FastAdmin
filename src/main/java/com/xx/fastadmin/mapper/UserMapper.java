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
     * @param user
     * @return
     */
    List<User> selectUserList(UserQuery userQuery);

}




