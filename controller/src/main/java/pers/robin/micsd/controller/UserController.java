package pers.robin.micsd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserController {

    void login(HttpServletRequest req, HttpServletResponse res);
}
