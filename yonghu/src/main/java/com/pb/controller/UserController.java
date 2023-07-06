package com.pb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.pb.entity.UserAddress;
import com.pb.exception.MMallException;
import com.pb.form.UserRegisterForm;
import com.pb.result.ResponseEnum;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;



@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    /**
     * 用户注册
     * @param userRegisterForm
     * @param bindingResult
     * @return
     */
    @PostMapping("/register")
    public String register(@Valid UserRegisterForm userRegisterForm, BindingResult bindingResult){
        //非空校验

            if(bindingResult.hasErrors()){
                //log.info("【用户注册】用户信息不能为空");
                //log.info("cuole ");
                throw new MMallException(ResponseEnum.USER_INFO_NULL);

            }

        return null;
    }




}

