package com.wangzhan.mapper;

import com.wangzhan.domain.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {
    @Select("select * from product_category")
    List<ProductCategory> findList();

}
