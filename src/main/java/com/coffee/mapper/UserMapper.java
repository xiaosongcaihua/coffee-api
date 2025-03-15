package com.coffee.mapper;

import com.coffee.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 谭方杰
* @description 针对表【user】的数据库操作Mapper
* @createDate 2025-03-15 15:18:30
* @Entity com.coffee.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}




