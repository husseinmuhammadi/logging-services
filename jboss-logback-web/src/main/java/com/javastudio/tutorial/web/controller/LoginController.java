package com.javastudio.tutorial.web.controller;

import com.javastudio.tutorial.service.LoginService;
import com.javastudio.tutorial.service.UserService;
import org.slf4j.Logger;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.InputStream;
import java.io.Serializable;

@Named
@RequestScoped
public class LoginController implements Serializable {

    @Inject
    private Logger logger;

    @EJB
    LoginService loginServic;

    @EJB
    UserService userService;

    public void login() {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("logback.xml");
            if (inputStream == null) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("logback.xml could not found"));
            }

            loginServic.login();
            userService.login();

            logger.info("Logged in done successfully.");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You have logged in successfully"));
        } catch (Throwable e) {
            logger.error("Error", e);
        }
    }

}
