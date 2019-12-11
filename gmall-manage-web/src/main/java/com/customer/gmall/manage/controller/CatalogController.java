package com.customer.gmall.manage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.gmall.bean.PmsBaseCatalog1;
import com.customer.gmall.bean.PmsBaseCatalog2;
import com.customer.gmall.bean.PmsBaseCatalog3;
import com.customer.gmall.service.CatalogService;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * ManageController
 *
 * @author Zichao Zhang
 * @date 2019/12/11
 */
@CrossOrigin("http://127.0.0.1:8888")
@RestController
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    //http://127.0.0.1:8081/getCatalog3?catalog2Id=1
    @PostMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(@RequestParam("catalog2Id") String catalog2Id) {
        return catalogService.getCatalog3(catalog2Id);
    }
    //    getCatalog2?catalog1Id=3
    @PostMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(@RequestParam("catalog1Id") String catalog1Id) {
        return catalogService.getCatalog2(catalog1Id);
    }

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalogService.getCatalog1();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
