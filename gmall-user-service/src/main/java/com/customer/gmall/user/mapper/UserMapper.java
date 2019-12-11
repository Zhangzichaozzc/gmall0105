package com.customer.gmall.user.mapper;


import java.util.List;

import com.customer.gmall.bean.UmsMember;

import tk.mybatis.mapper.common.Mapper;

/**
 * UserMapper
 * 整合通用 Mapper 后需要继承通用 Mapper 的 Mapper 接口
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
