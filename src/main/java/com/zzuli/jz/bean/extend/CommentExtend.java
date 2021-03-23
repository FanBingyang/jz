package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.Comment;

import java.util.List;

/**
 * @author ：dyjin
 * @description：评论拓展类
 * @date ：Created in 2020/6/14 17:21
 */
public class CommentExtend extends Comment {
    private List<Comment> children;

    public List<Comment> getChildren(){
        return children;
    }

    public void setChildren(List<Comment> children){
        this.children = children;
    }

}
