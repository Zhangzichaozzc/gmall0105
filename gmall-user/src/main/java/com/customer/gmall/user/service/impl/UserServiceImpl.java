package com.customer.gmall.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.gmall.user.bean.UmsMember;
import com.customer.gmall.user.bean.UmsMemberReceiveAddress;
import com.customer.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.customer.gmall.user.mapper.UserMapper;
import com.customer.gmall.user.service.UserService;

/**
 * UserServiceImpl
 *
 * @author Zichao Zhang
 * @date 2019/12/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> getAllUser() {
//        return userMapper.selectAllUser();
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddresseByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
