package com.ksz.blog.service;

import com.ksz.blog.vo.Result;
import com.ksz.blog.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    Result findAll();

    Result findAllDetail();

    Result findADetailById(Long id);

    void deleteArticle(Long articleId);
}
