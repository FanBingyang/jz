package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.Comment;
import com.zzuli.jz.bean.extend.CommentExtend;

import java.util.List;

/**
 * @author ：dyjin
 * @description：评论拓展接口
 * @date ：Created in 2020/6/14 17:29
 */
public interface CommentExtendMapper {
    List<CommentExtend> selectAllWithChild();

    List<Comment> selectById(long id);
}
