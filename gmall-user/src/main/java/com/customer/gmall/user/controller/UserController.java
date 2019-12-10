package com.customer.gmall.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.gmall.bean.UmsMember;
import com.customer.gmall.bean.UmsMemberReceiveAddress;
import com.customer.gmall.service.UserService;


/**
 * UserController
 *
 * @author Zichao Zhang
 * @date 2019/12/10
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index() {
        return "Hello Spring Boot";
    }

    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("/getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddresseByMemberId(@RequestParam("memberId") String memberId) {
        return userService.getReceiveAddresseByMemberId(memberId);
    }

}
