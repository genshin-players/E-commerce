package com.pb;

import com.pb.service.ProductCategoryService;
import com.pb.vo.ProductCategoryVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MmallApplicationTests {
    @Autowired
    private ProductCategoryService service;

    @Test
    void contextLoads() {
        List<ProductCategoryVO> productCategoryVOList = this.service.buildProductCategoryMenu();
        int i = 0;
    }
}
