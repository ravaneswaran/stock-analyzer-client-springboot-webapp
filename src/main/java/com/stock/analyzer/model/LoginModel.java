package com.stock.analyzer.model;

import lombok.Data;

@Data
public class LoginModel {

    private String username;

    private String password;

    private boolean loginSuccess;

    private String message;

}
