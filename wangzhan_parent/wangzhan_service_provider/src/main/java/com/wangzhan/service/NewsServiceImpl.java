package com.wangzhan.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wangzhan.domain.News;
import com.wangzhan.entity.PageResult;
import com.wangzhan.entity.QueryPageBean;
import com.wangzhan.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.List;

@Service(interfaceClass = NewsService.class)
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public PageResult findList(QueryPageBean queryPageBean) {
        try {
            //页码
            Integer currentPage = queryPageBean.getCurrentPage();
            //每页记录数
            Integer pageSize = queryPageBean.getPageSize();
            //查询条件
            String queryString = queryPageBean.getQueryString();
            //判断页码合理性
            if(currentPage==null || currentPage.intValue()<1){
                currentPage=1;
            }
            //判断记录数合理性
            if(pageSize==null || pageSize.intValue()<0){
                pageSize=9;
            }
            if(queryString.length()==0){
                queryString=null;
            }
            PageHelper.startPage(currentPage,pageSize);
            Page<News> page= (Page<News>) newsMapper.findList(queryString);
            long total = page.getTotal();
            List<News> list = page.getResult();
            return new PageResult(total,list);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
