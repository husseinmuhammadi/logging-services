package com.javastudio.tutorial.service;

import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService {

    @Inject
    private Logger logger;

    public void login() {
        logger.info("User2 logged in successfully.");
    }
}
