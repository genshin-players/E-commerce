package com.pb.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pb.entity.Orders;
import com.pb.mapper.OrdersMapper;
import com.pb.service.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {


}
