package com.ksz.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ksz.blog.dao.pojo.ArticleBody;
import com.ksz.blog.dao.pojo.ArticleTag;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ArticleBodyMapper extends BaseMapper<ArticleBody> {
}

