package com.javastudio.tutorial.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;

@Stateless
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void login() {
        logger.info("User2 logged in successfully.");
    }
}
