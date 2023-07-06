package com.pb.mapper;

import com.pb.entity.ProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;


public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

/*
    int updateCategory(@Param("name") String newName , @Param("id") Integer id);
*/
}
