package com.ksz.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ksz.blog.dao.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章id查找标签列表
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotsTagIds(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);

    @Select("DELETE ms_article_body,ms_article_tag from ms_article_body LEFT JOIN ms_article_tag ON ms_article_body.article_id=ms_article_tag.article_id WHERE ms_article_tag.article_id = #{articleId}")
    void deleteArticle(Long articleId);
}
