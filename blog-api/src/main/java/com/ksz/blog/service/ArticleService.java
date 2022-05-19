package com.ksz.blog.service;

import com.ksz.blog.vo.ArticleVo;
import com.ksz.blog.vo.Result;
import com.ksz.blog.vo.params.ArticleParam;
import com.ksz.blog.vo.params.PageParams;

public interface ArticleService {

    /**
     * 分页查询文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 最新文章
     * @param limit
     * @return
     */
    Result newArticle(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);


    /**
     * 文章发布服务
     * @param articleParam
     * @return
     */
    Result publish(ArticleParam articleParam);

    /**
     * 文章删除
     * @param articleId
     * @return
     */
    Result reMoveArticleById(Long articleId);

    /**
     * 文章搜索
     * @param search
     * @return
     */
    Result searchArticle(String search);
}
