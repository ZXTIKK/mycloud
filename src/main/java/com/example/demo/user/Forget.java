package com.example.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Forget {
    @GetMapping("/forget")
    public String giveForgetPage(){
        return "forget";
    }
}
