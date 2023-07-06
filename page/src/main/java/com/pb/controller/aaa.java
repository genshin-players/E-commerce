package com.pb.controller;


import com.pb.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aaa {

    @RequestMapping("/register")
    public String register(User user){

        return "login/page-login";
    }
}
