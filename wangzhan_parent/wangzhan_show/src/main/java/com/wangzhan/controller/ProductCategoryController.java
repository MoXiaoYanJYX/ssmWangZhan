package com.wangzhan.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.wangzhan.domain.ProductCategory;
import com.wangzhan.entity.Result;
import com.wangzhan.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Reference
    private ProductCategoryService productCategoryService;

    @RequestMapping("/findList")
    public Result findList(){
        List<ProductCategory> productCategoryList = productCategoryService.findList();
        if(productCategoryList==null){
            return new Result(false,"查询失败",null);
        }
        return new Result(true,"查询成功",productCategoryList);

    }
}
