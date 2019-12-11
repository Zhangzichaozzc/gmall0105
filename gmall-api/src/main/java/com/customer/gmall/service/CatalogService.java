package com.customer.gmall.service;

import java.util.List;

import com.customer.gmall.bean.PmsBaseCatalog1;
import com.customer.gmall.bean.PmsBaseCatalog2;
import com.customer.gmall.bean.PmsBaseCatalog3;

/**
 * CatalogService
 *
 * @author Zichao Zhang
 * @date 2019/12/11
 */
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
