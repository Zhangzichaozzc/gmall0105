package com.customer.gmall.service;

import java.util.List;

import com.customer.gmall.bean.UmsMember;
import com.customer.gmall.bean.UmsMemberReceiveAddress;

/**
 * UserService
 *
 * @author Zichao Zhang
 * @date 2019/12/10
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddresseByMemberId(String memberId);
}
