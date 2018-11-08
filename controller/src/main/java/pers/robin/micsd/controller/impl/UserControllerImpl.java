package pers.robin.micsd.controller.impl;

import org.springframework.web.bind.annotation.RestController;
import pers.robin.micsd.controller.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserControllerImpl implements UserController {

    @Override
    public void login(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("login!");
    }
}
