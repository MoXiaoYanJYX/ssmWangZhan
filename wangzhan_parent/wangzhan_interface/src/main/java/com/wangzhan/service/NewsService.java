package com.wangzhan.service;

import com.wangzhan.entity.PageResult;
import com.wangzhan.entity.QueryPageBean;

public interface NewsService {

    PageResult findList(QueryPageBean queryPageBean);
}
