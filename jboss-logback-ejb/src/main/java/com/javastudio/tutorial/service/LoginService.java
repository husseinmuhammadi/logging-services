package com.javastudio.tutorial.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;

@Stateless
public class LoginService {

    private final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public void login() {
        logger.info("User logged in successfully.");
    }
}
