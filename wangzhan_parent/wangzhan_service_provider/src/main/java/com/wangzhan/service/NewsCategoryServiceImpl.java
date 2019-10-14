package com.wangzhan.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wangzhan.domain.NewsCategory;
import com.wangzhan.mapper.NewsCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = NewsCategoryService.class )
public class NewsCategoryServiceImpl implements NewsCategoryService {

    @Autowired
    private NewsCategoryMapper newsCategoryMapper;

    public List findList() {
        try {
            List<NewsCategory> newsCategoryList=newsCategoryMapper.findList();
            return newsCategoryList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
