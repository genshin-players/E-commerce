package com.pb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pb.entity.OrderDetail;
import com.pb.mapper.OrderDetailMapper;
import com.pb.service.OrderDetailService;
import org.springframework.stereotype.Service;


@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
