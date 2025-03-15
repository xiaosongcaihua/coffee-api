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

import java.util.Map;

@RestController
@RequestMapping("user")
public class UseController {
    @Autowired
    private UserService userService;
    @PostMapping("login")
    public R login(@RequestBody Map<String, Object> requestData){
        String uno = (String) requestData.get("Uno");
        String upassword = (String) requestData.get("Upassword");
        UserLoginForm user = new UserLoginForm(uno , upassword);
        User userById = userService.login(user);
        if (userById == null) {
            return R.error("用户不存在或者密码错误");
        }
        return R.ok(userById);
    }

    @PostMapping("info")
    public R getUserByUNO(@RequestBody  Map<String, Object> requestData){
        String uno = (String) requestData.get("Uno");
        User user = userService.selectUserById(uno);
        return R.ok(user);
    }
    @PostMapping("register")
    public R register(@RequestBody Map<String, Object> requestData){
        String uno = (String) requestData.get("Uno");
        String upassword = (String) requestData.get("Upassword");
        String uname = (String) requestData.get("Uname");
        User user = new User(uno , uname ,upassword);
        User userByDB = userService.register(user);
        if (userByDB != null) {
            return R.ok(userByDB);
        } else {
            return R.error("注册失败");
        }
    }
    @PostMapping("psd")
    public R updatePSD(@RequestBody Map<String, Object> requestData){
        String upassword = (String) requestData.get("Upassword");
        String uno = (String) requestData.get("Uno");
        User user = userService.updatePSD(uno, upassword);
        if (user == null) {
            return R.error("更新密码失败");
        } else {
            return R.ok(user);
        }
    }
}
