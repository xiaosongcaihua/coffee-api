package com.coffee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coffee.controller.form.UserLoginForm;
import com.coffee.pojo.User;
import com.coffee.service.UserService;
import com.coffee.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 谭方杰
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-03-15 15:18:30
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    private UserMapper userMapper;

    /**
     *
     * @param user 前端传递过来的用户
     * @return 如果用户不存在或者密码错误返回null否则返回用户对象
     */
    @Override
    public User login(UserLoginForm user) {
        User userById = userMapper.selectById(user.getUno());
        //TODO 新增对密码的解密
        if(userById == null || userById.getUpassword().equals(user.getUpassword())) {
            return null;
        }
        return userById;
    }
}




