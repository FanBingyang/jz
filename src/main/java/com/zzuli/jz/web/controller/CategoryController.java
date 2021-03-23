package com.zzuli.jz.web.controller;


import com.zzuli.jz.bean.extend.CategoryExtend;
import com.zzuli.jz.bean.Category;
import com.zzuli.jz.service.ICategoryService;
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

@RestController
@RequestMapping("/category")
@Api(description = "栏目管理接口")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;


    @GetMapping("findAll")
    @ApiOperation("查找所有类别")
    public Message findAll(){
        List<Category> list = categoryService.findAll();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "通过id删除类别信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "唯一编号",required = true,paramType = "query")
    })
    @GetMapping("deleteById")
    public Message deleteById(long id){
        categoryService.deleteById(id);
        return MessageUtil.success("删除成功！");
    }

    @PostMapping("saveOrUpdate")
    @ApiOperation("保存或修改类别信息")
    public Message saveOrUpdate(Category category){
        categoryService.saveOrUpdate(category);
        return MessageUtil.success("保存成功！");
    }

    @GetMapping("findAllWithChild")
    @ApiOperation("根据名称查询所有类别,级联获得类别")
    public Message findAllWithChild(String name){
        List<CategoryExtend> list = categoryService.findAllWithChild(name);
        return MessageUtil.success(list);
    }
}
