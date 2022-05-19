package com.ksz.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {

    @RequestMapping({"/", "index","home"})
    public String index() {
        return "main.html";
    }

    @RequestMapping({"/login"})
    public String login() {
        return "login.html";
    }
}
