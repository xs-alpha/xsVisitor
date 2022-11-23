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
@ComponentScan(basePackages = {"com.cf"})  // 扫扩展包  用于类或接口上主要是指定扫描路径，spring会把指定路径下带有指定注解的类注册到IOC容器中。会被自动装配的注解包括@Controller、@Service、@Component、@Repository等等。
@MapperScan("com.xiaosheng.dao.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class XsVisitorApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(XsVisitorApiApplication.class, args);
    }

}

