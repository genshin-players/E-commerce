package com.pb.client;


import com.pb.vo.ProductCategoryVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Component
@FeignClient(value="yonghu")
public interface UserClient {

    //@RequestMapping("/user/showTeacher")

    @RequestMapping("productCategory/main")
    public List<ProductCategoryVO> main();




}
