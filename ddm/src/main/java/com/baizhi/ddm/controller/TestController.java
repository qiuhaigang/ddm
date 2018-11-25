package com.baizhi.ddm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("test")
    public String test(){


        return "第一次测试成功";

    }

}
