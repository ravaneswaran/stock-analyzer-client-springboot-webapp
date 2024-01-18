package com.stock.analyzer.service.impl;

import com.stock.analyzer.entity.User;
import com.stock.analyzer.enumeration.UserStatus;
import com.stock.analyzer.model.LoginModel;
import com.stock.analyzer.repository.UserRepository;
import com.stock.analyzer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void login(LoginModel loginModel) {
        User user = this.userRepository.findBy(loginModel.getUsername(), loginModel.getPassword());

        if(UserStatus.VERIFIED.toString().equals(user.getStatus())){
            loginModel.setLoginSuccess(true);
        }
    }
}
