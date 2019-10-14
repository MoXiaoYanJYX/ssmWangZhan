package com.wangzhan.mapper;

import com.wangzhan.domain.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper {
    @Select("<script>"
            +"  select * from news"
            +" <where>"
            +"      <if test='queryString != null'>"
            +"        and cid=#{queryString}"
            +"      </if>"
            +" </where>"
            +"</script>"
    )
    List<News> findList(@Param("queryString") String queryString);
}
