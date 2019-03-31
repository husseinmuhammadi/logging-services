package com.javastudio.tutorial.web.controller;

import com.javastudio.tutorial.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class LoginController implements Serializable {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @EJB
    LoginService loginService;

    Long counter = 0L;

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public void increase() {
        logger.info("increase start");
        loginService.login();
        counter++;
        logger.info("increase end");
    }
}
