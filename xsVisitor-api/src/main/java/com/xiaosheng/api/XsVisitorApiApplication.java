package com.xiaosheng.api;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: lpy
 * @Date: 2022/11/23
 */
@ComponentScan(basePackages = {"com.xiaosheng"})
@MapperScan("com.xiaosheng.dao.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class XsVisitorApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(XsVisitorApiApplication.class, args);
    }

}

