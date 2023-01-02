package com.kelechi.housemsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/users-profile")
    public String profile(){
        return "users-profile";
    }
}
