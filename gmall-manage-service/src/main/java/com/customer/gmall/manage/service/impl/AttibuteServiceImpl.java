package com.customer.gmall.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customer.gmall.bean.PmsBaseAttrInfo;
import com.customer.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.customer.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.customer.gmall.service.AttibuteService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * AttibuteServiceImpl
 *
 * @author Zichao Zhang
 * @date 2019/12/11
 */
@Service
public class AttibuteServiceImpl implements AttibuteService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
    }
}
