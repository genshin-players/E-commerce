package com.pb.controller;



import com.pb.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    @PostMapping("/register")
    public String register(User user){
        System.out.println(user);
        return null;
    }






}

