package com.wangzhan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wangzhan.domain.NewsCategory;
import com.wangzhan.entity.Result;
import com.wangzhan.service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/newsCategory")
public class NewsCategoryController {

    @Reference
    private NewsCategoryService newsCategoryService;

    @RequestMapping("/findList")
    public Result findList(){
        List<NewsCategory> newsCategoryList=newsCategoryService.findList();
        if(newsCategoryList==null){
            return new Result(false,"查询失败",null);
        }
        return new Result(false,"查询成功",newsCategoryList);
    }
}
