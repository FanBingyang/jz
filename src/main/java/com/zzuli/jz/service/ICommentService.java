package com.zzuli.jz.service;

import com.zzuli.jz.bean.Comment;
import com.zzuli.jz.bean.extend.CommentExtend;
import com.zzuli.jz.utils.CustomerException;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();

    List<CommentExtend> findAllWithChild();

    Comment selectById(long id);

    void deleteById(long id) throws CustomerException;

    void saveOrUpdate(Comment comment) throws CustomerException;

    void commit(Comment comment) throws CustomerException;

    /**
     * 根据评分区间和内容进行多条件查询
     * @param minScore
     * @param maxScore
     * @param content
     * @return
     */
    List<Comment> selectByExample(Integer minScore,Integer maxScore,String content);

}
