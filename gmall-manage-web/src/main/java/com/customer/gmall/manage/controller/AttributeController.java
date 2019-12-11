package com.customer.gmall.manage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.gmall.bean.PmsBaseAttrInfo;
import com.customer.gmall.service.AttibuteService;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * AttributeController
 *
 * @author Zichao Zhang
 * @date 2019/12/11
 */
@RestController
@CrossOrigin("http://127.0.0.1:8888")
public class AttributeController {

    @Reference
    private AttibuteService attibuteService;

    // http://127.0.0.1:8081/attrInfoList?catalog3Id=192
    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(@RequestParam("catalog3Id") String catalog3Id) {
        return attibuteService.attrInfoList(catalog3Id);
    }

}
