package com.example.demo.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Registration {
    @GetMapping("/registration")
    public String giveRegistrationPage(){
        return "register";
    }
}
