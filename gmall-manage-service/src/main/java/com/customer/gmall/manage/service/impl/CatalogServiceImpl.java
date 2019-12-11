package com.customer.gmall.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customer.gmall.bean.PmsBaseCatalog1;
import com.customer.gmall.bean.PmsBaseCatalog2;
import com.customer.gmall.bean.PmsBaseCatalog3;
import com.customer.gmall.manage.mapper.Catalog1Mapper;
import com.customer.gmall.manage.mapper.Catalog2Mapper;
import com.customer.gmall.manage.mapper.Catalog3Mapper;
import com.customer.gmall.service.CatalogService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * CatalogServiceImpl
 *
 * @author Zichao Zhang
 * @date 2019/12/11
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private Catalog1Mapper catalog1Mapper;

    @Autowired
    private Catalog2Mapper catalog2Mapper;

    @Autowired
    private Catalog3Mapper catalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return catalog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return catalog3Mapper.select(pmsBaseCatalog3);
    }

}
