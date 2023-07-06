package cn.pb.service.impl;

import cn.pb.entity.UserAddress;
import cn.pb.mapper.UserAddressMapper;
import cn.pb.service.UserAddressService;
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
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {

}
