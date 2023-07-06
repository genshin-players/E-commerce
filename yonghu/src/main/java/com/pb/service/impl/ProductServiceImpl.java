package com.pb.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pb.entity.Product;
import com.pb.mapper.ProductMapper;
import com.pb.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {


}
