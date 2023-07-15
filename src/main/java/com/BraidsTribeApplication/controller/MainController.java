package com.BraidsTribeApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // SecurityConfiguration,
    // this is the MAIN page when a user goes to http://localhost:8099
    @GetMapping("/login")
    public String login(Model model) {
        return "login";

    }
  }



