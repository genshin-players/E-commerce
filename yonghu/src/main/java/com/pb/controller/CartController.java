package com.pb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.pb.entity.Cart;
import com.pb.entity.Orders;
import com.pb.service.CartService;
import com.pb.service.UserAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/cart")
@Slf4j
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private UserAddressService userAddressService;


}

