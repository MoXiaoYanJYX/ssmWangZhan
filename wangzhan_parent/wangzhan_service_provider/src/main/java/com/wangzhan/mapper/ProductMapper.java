package com.wangzhan.mapper;

import com.wangzhan.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("<script>"
            +"  select * from product"
            +" <where>"
            +"      <if test='queryString != null'>"
            +"        and cid=#{queryString}"
            +"      </if>"
            +" </where>"
            +"</script>"
        )
    List<Product> findList(@Param("queryString") String queryString);
}
