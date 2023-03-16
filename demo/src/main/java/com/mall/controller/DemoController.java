package com.mall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Zxp
 * @Description:
 * @Version: 1.0
 */
@RestController
public class DemoController {
    @RequestMapping("/index")

    public String index(){
        return "hello SpringBoot2! + pc ! + jqd";
    }
}
