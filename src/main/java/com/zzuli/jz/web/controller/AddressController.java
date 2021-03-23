package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.Address;
import com.zzuli.jz.bean.Product;
import com.zzuli.jz.bean.extend.AddressExtend;
import com.zzuli.jz.bean.extend.ProductExtend;
import com.zzuli.jz.service.IAddressService;
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
 * @Description 地址控制器
 * @Date 2020/6/13 22:31
 * @Version 1.0
 */

@RestController
@RequestMapping("/address")
@Api(description="地址管理接口")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    /**
     *
     * @Author  yy
     * @Description  查询所有地址，并且级联所属用户
     * @Date  2020/6/13 22:33
     * @Version  1.0
     *
     **/
    @ApiOperation(value="通过用户查找地址信息")
    @GetMapping("/findAllWithUser")
    public Message findAllWithUser(){

        List<AddressExtend> list = addressService.findAllWithUser();
        return MessageUtil.success(list);
    }

    @ApiOperation(value="查找所有地址信息")
    @GetMapping("/findAll")
    public Message findAll(){
        List<Address> list = addressService.findAll();
        return  MessageUtil.success(list);
    }

    @ApiOperation(value="通过id删除地址信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="唯一编号",required=true,paramType="query")
    })
    @GetMapping("/deleteById")
    public Message deleteById(long id) {
        addressService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @ApiOperation(value="新增或更新地址信息")
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(Address address){
        addressService.saveOrUpdate(address);
        return MessageUtil.success("保存成功");
    }
}
