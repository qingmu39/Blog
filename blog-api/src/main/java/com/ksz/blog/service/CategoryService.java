package com.ksz.blog.service;


import com.ksz.blog.vo.CategoryVo;
import com.ksz.blog.vo.Result;

import java.util.List;

public interface CategoryService {


    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);
}

