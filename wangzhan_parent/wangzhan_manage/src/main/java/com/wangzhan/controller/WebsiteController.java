package com.wangzhan.controller;

import com.wangzhan.entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/website")
public class WebsiteController {

    @RequestMapping("/findById")
    public Result findById(String id){
        return null;
    }
}
