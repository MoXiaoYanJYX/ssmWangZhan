package com.wangzhan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangzhan.entity.PageResult;
import com.wangzhan.entity.QueryPageBean;
import com.wangzhan.entity.Result;
import com.wangzhan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Reference
    private ProductService productService;

    @RequestMapping("/findPage")
    @ResponseBody
    public Result findPage(QueryPageBean queryPageBean){
        PageResult pageResult = productService.findPage(queryPageBean);
        if(pageResult==null){
            return new Result(false,"查询失败",null);
        }
        return new Result(true,"查询成功",pageResult);
    }
}

