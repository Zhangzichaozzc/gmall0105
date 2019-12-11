package com.customer.gmall.service;

import java.util.List;

import com.customer.gmall.bean.PmsBaseAttrInfo;

/**
 * AttibuteService
 *
 * @author Zichao Zhang
 * @date 2019/12/11
 */
public interface AttibuteService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
