package com.pb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pb.entity.UserAddress;
import com.pb.mapper.UserAddressMapper;
import com.pb.service.UserAddressService;
import org.springframework.stereotype.Service;


@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {

}
