package com.pb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pb.entity.ProductCategory;
import com.pb.vo.ProductCategoryVO;

import java.util.List;


public interface ProductCategoryService extends IService<ProductCategory> {

    //构建菜单
    public List<ProductCategoryVO> buildProductCategoryMenu();



    Boolean delete(Integer oneId);

    //修改分类的数据

   /* Boolean updateCategory(String newName ,Integer id);*/
}
