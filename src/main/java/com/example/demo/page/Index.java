package com.example.demo.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Index {

    @GetMapping("/")
    public String getYouCloud() {
        return "index"; // Убедитесь, что файл index.html существует в templates/
    }

    @PostMapping("/")
    public String[] userLogin(String[] args){
        return args;
    }
}