package com.karasusoft.arenafitnessapi.controller;

import com.karasusoft.arenafitnessapi.constants.PagesConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){

        return PagesConstants.HOME_PAGE;
    }

    @GetMapping("/login")
    public String login(){

        return PagesConstants.LOGIN_PAGE;
    }
}
