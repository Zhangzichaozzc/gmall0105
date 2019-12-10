package com.customer.gmall.user.service;

import java.util.List;

import com.customer.gmall.user.bean.UmsMember;
import com.customer.gmall.user.bean.UmsMemberReceiveAddress;

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
