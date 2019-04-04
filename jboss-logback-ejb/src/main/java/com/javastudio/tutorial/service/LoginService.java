package com.javastudio.tutorial.service;

import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class LoginService {

    @Inject
    private Logger logger;

    public void login() {
        logger.info("User logged in successfully.");
    }
}
