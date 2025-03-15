package com.coffee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coffee.pojo.User;
import com.coffee.service.UserService;
import com.coffee.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 谭方杰
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-03-15 15:18:30
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




