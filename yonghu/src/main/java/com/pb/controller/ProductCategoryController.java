package com.pb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.pb.entity.ProductCategory;
import com.pb.entity.User;
import com.pb.service.CartService;
import com.pb.service.ProductCategoryService;
import com.pb.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;
    @Autowired
    private CartService cartService;

    @RequestMapping("/main")
    public List<ProductCategoryVO> main(){
        List<ProductCategoryVO> productCategoryVOList = productCategoryService.buildProductCategoryMenu();
        return productCategoryVOList;
    }

    @RequestMapping("/delete")
    public  Boolean delete(Integer id){
        Boolean delete = productCategoryService.delete(id);
        return  delete;
    }


    @RequestMapping("/update")
    public  Boolean update(String name,Integer id){
        System.out.println(name);
        System.out.println(id);
        UpdateWrapper<ProductCategory> updateWrapper = new UpdateWrapper<>();

        updateWrapper.eq("id", id); // 设置更新条件，例如：id = 1

        ProductCategory newCategory = new ProductCategory();
        newCategory.setName(name); // 设置要更新的字段和新的值，例如：将categoryName字段更新为newName

        boolean isSuccess = productCategoryService.update(newCategory, updateWrapper);
        return isSuccess;
    }





}

