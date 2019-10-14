package com.wangzhan.mapper;

import com.wangzhan.domain.NewsCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsCategoryMapper {

    @Select("select * from news_category")
    List<NewsCategory> findList();

}
