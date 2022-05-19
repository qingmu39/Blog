package com.ksz.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ksz.blog.dao.pojo.Category;
import com.ksz.blog.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}

