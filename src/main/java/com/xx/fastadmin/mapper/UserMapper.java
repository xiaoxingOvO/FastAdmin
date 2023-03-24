package com.xx.fastadmin.mapper;

import com.xx.fastadmin.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author xiaoxing
* @description 针对表【user(用户信息表)】的数据库操作Mapper
* @createDate 2023-03-24 10:51:09
* @Entity com.xx.fastadmin.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




