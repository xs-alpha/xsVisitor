package com.xiaosheng.api.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lpy
 * @Date: 2022/11/23
 */
@Component
@RestController
public class test {
    @GetMapping("/heart")
    public String heart(){
        return "200";
    }
}
