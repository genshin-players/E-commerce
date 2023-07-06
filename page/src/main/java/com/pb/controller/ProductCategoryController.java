package com.pb.controller;


import com.pb.client.UserClient;
import com.pb.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Autowired
    private UserClient userClient;

    @RequestMapping("/main")
    public String showTeacher(Model model) {
        List<ProductCategoryVO> main = userClient.main();
        model.addAttribute("main",main);
        return "fenlei/show_student";
    }



}

