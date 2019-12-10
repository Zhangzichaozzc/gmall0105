package com.customer.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * 整合 通用 Mapper 后 需要使用 tk.mapper 的 Mapper 扫描器
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.customer.gmall.user.mapper"})
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
