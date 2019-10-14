package com.wangzhan.controller;

import com.wangzhan.entity.PageResult;
import com.wangzhan.entity.QueryPageBean;
import com.wangzhan.entity.Result;
import com.wangzhan.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/findList")
    private Result findList(QueryPageBean queryPageBean){
        PageResult pageResult=newsService.findList(queryPageBean);
        if(pageResult==null){
            return new Result(false,"查询失败",null);
        }
        return new Result(true,"查询成功",pageResult);
    }
}
