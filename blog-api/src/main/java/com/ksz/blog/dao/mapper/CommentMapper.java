package com.ksz.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ksz.blog.dao.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

    @Select("SELECT COUNT(*) FROM ms_comment WHERE parent_id = #{id}")
    int isChildrens(Long id);
}
