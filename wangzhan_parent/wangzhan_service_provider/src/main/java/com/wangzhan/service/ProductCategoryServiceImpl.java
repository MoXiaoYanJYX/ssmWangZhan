package com.wangzhan.service;

import com.wangzhan.domain.ProductCategory;
import com.wangzhan.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.List;

@Service(interfaceClass = ProductCategoryService.class)
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    public List findList() {
        try {
            List<ProductCategory> productCategoryList = productCategoryMapper.findList();
            return productCategoryList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
