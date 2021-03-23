package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.Comment;
import com.zzuli.jz.bean.CommentExample;
import com.zzuli.jz.bean.extend.CommentExtend;
import com.zzuli.jz.dao.CommentMapper;
import com.zzuli.jz.dao.extend.CategoryExtendMapper;
import com.zzuli.jz.dao.extend.CommentExtendMapper;
import com.zzuli.jz.service.ICommentService;
import com.zzuli.jz.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：dyjin
 * @description：评论实现类
 * @date ：Created in 2020/6/14 17:27
 */
@Service
public class CommentServiceImpl implements ICommentService {
    @Resource
    private CommentMapper commentMapper;
    @Resource
    private CommentExtendMapper commentExtendMapper;

    @Override
    public List<Comment> findAll(){
        return commentMapper.selectByExample(new CommentExample());
    }

    @Override
    public List<CommentExtend> findAllWithChild(){
        return commentExtendMapper.selectAllWithChild();
    }


    @Override
    public void saveOrUpdate(Comment comment) throws CustomerException {
        if (comment.getId() != null){
            commentMapper.updateByPrimaryKey(comment);
        }else{
            commentMapper.insert(comment);
        }
    }

    @Override
    public Comment selectById(long id){
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(long id) throws CustomerException{
        Comment comment = commentMapper.selectByPrimaryKey(id);
        if (comment == null){
            throw new CustomerException("删除失败，要删除的数据不存在");
        }
        commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void commit(Comment comment) throws CustomerException{
        if (comment.getId()==null){
            commentMapper.insert(comment);
        }else {
            Comment comment1 = commentMapper.selectByPrimaryKey(comment.getId());
            if (comment1 == null){
                throw new CustomerException("修改失败，数据不存在");
            }
            commentMapper.updateByPrimaryKey(comment);
        }
    }

    /**
     * 根据评分区间和内容进行多条件查询
     *
     * @param minScore
     * @param maxScore
     * @param content
     * @return
     */
    @Override
    public List<Comment> selectByExample(Integer minScore, Integer maxScore, String content) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();

        if (minScore != null && maxScore != null){
            criteria.andScoreBetween(minScore,maxScore);
        }
        if(minScore != null && maxScore == null){
            criteria.andScoreBetween(minScore,100);
        }
        if(minScore == null && maxScore != null){
            criteria.andScoreBetween(0,maxScore);
        }
        if (content != null){
            criteria.andContentLike('%'+content+'%');
        }
        return commentMapper.selectByExample(example);
    }

}
