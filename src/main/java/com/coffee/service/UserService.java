package com.coffee.service;

import com.coffee.controller.form.UserLoginForm;
import com.coffee.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 谭方杰
* @description 针对表【user】的数据库操作Service
* @createDate 2025-03-15 15:18:30
*/
public interface UserService extends IService<User> {
    User login(UserLoginForm user);
}
