package com.coffee.controller;

import com.coffee.common.R;
import com.coffee.controller.form.UserLoginForm;
import com.coffee.pojo.User;
import com.coffee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UseController {
    @Autowired
    private UserService userService;
    @PostMapping("login")
    public R login(@RequestBody UserLoginForm user){
        User userById = userService.login(user);
        if (userById == null) {
            return R.error("用户不存在或者密码错误");
        }
        return R.ok(userById);
    }
}
