package com.stock.analyzer.controller;

import com.stock.analyzer.service.UserService;
import com.stock.analyzer.model.LoginModel;
import com.stock.analyzer.service.impl.UserServiceImpl;
import com.stock.analyzer.util.EncryptedPasswordGeneratorUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("username")String username, @RequestParam("password") String password, HttpServletRequest request){

        String encryptedPassword = EncryptedPasswordGeneratorUtil.getMD5(password);

        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(username);
        loginModel.setPassword(encryptedPassword);

        this.userService.login(loginModel);

        if(loginModel.isLoginSuccess()){
            return "analyzer";
        } else {
            loginModel.setMessage("Login Failure !!!");
            return "login";
        }
    }

}
