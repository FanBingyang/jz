package com.zzuli.jz.web.controller;


import com.zzuli.jz.bean.Comment;
import com.zzuli.jz.bean.extend.CommentExtend;
import com.zzuli.jz.service.ICommentService;
import com.zzuli.jz.utils.Message;
import com.zzuli.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：dyjin
 * @description：评论控制器
 * @date ：Created in 2020/6/14 17:38
 */

@Api(description = "评论管理接口")
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @PostMapping("commit")
    @ApiOperation("上传(id不填)或修改评论")
    public Message commit(Comment comment){
        commentService.commit(comment);
        return MessageUtil.success("提交成功");
    }
    @GetMapping("findAll")
    @ApiOperation("查询所有评论")
    public Message findAll(){
        return MessageUtil.success(commentService.findAll());
    }

    @GetMapping("findAllWithChild")
    @ApiOperation("查询所有评论,级联获得评论")
    public Message findAllWithChild(){
        return MessageUtil.success(commentService.findAllWithChild());
    }

    @GetMapping("selectById")
    @ApiOperation("通过id查询评论")
    public Message selectById(long id){
        Comment comment = commentService.selectById(id);
        return MessageUtil.success(comment);
    }

    @GetMapping("refuseAuditing")
    @ApiOperation("拒绝审核")
    public Message refuseAuditing(long id){
        Comment comment = commentService.selectById(id);
        comment.setStatus("审核不通过");
        commentService.saveOrUpdate(comment);
        return MessageUtil.success("已拒绝审核");
    }

    @PostMapping("saveOrUpdate")
    @ApiOperation("保存或修改评论信息")
    public Message saveOrUpdate(Comment comment){
        commentService.saveOrUpdate(comment);
        return MessageUtil.success("保存成功！");
    }


    @GetMapping("deleteById")
    @ApiOperation("通过id删除评论")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "唯一编号",required = true,paramType = "query")
    })
    public Message deleteById(long id){
        commentService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    /**
     * 根据评分区间和内容进行多条件查询
     * @param minScore
     * @param maxScore
     * @param content
     * @return
     */
    @ApiOperation("根据评分区间和内容进行多条件查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "minScore", value = "最低评分", paramType = "query"),
            @ApiImplicitParam(name = "maxScore", value = "最高评分", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "评论内容", paramType = "query")
    })
    @GetMapping("selectByExample")
    public Message selectByExample(Integer minScore, Integer maxScore, String content){
        List<Comment> list = commentService.selectByExample(minScore,maxScore,content);
        return MessageUtil.success(list);
    }

}
