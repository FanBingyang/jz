package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.Product;
import com.zzuli.jz.bean.extend.ProductExtend;
import com.zzuli.jz.service.IProductService;
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
 * @Author yy
 * @Description 产品控制器
 * @Date 2020/6/13 17:10
 * @Version 1.0
 */
@RestController
@RequestMapping("/product")
@Api(description="产品管理接口")
public class ProductController {
    @Autowired
    private IProductService productService;

    /**
     *
     * @Author  yy
     * @Description  查询所有产品，并且级联所属栏目
     * @Date  2020/6/13 17:12
     * @Version  1.0
     *
     **/
    @ApiOperation(value="通过名称查找产品级联信息")
    @GetMapping("/findAllWithCategory")
    public Message findAllWithCategory(String name){

        List<ProductExtend> list = productService.findAllWithCategory(name);
        return MessageUtil.success(list);
    }

    @ApiOperation(value="查找所有产品信息")
    @GetMapping("/findAll")
    public Message findAll(){
        List<Product> list = productService.findAll();
        return  MessageUtil.success(list);
    }

    @ApiOperation(value="通过id删除产品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="唯一编号",required=true,paramType="query")
    })
    @GetMapping("/deleteById")
    public Message deleteById(long id) {
        productService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @ApiOperation(value="新增或更新产品信息")
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(Product product){
        productService.saveOrUpdate(product);
        return MessageUtil.success("保存成功");
    }
}
