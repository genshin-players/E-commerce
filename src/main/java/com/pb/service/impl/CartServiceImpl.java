package com.pb.service.impl;

import com.pb.entity.Cart;
import com.pb.mapper.CartMapper;
import com.pb.service.CartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljj
 * @since 2023-07-01
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {

}
