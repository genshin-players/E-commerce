package com.pb.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* <p>
    *
    * </p>
*
* @author pb
* @since 2023-07-05
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class AdCategory implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 广告分类ID
            */
    private Integer categoryId;

            /**
            * 广告分类名称
            */
    private String categoryName;

            /**
            * 父级分类ID
            */
    private Integer parentCategoryId;

            /**
            * 级别(1:一级 2：二级 3：三级)
            */
    private Integer categoryType;


}
