package com.javastudio.tutorial.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController {

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    private String username = "Narges";

    public String getUsername() {
        logger.info("Logger --> Hello");
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
