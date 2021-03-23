package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.AccountCustomer;
import com.zzuli.jz.service.IAccountCustomerService;
import com.zzuli.jz.utils.Message;
import com.zzuli.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: FBY
 * @Date: 2020/6/15 8:32
 * @Version 1.0
 */
@Api(description = "顾客账户管理接口")
@RestController
@RequestMapping("AccountCustomer")
public class AccountCustomerController {

    @Autowired
    private IAccountCustomerService iAccountCustomerService;

    /**
     * 提交审核
     * @param accountCustomer
     * @return
     */
    @ApiOperation("提交审核")
    @GetMapping("save")
    public Message save(AccountCustomer accountCustomer){
        iAccountCustomerService.save(accountCustomer);
        return MessageUtil.success("保存成功");
    }

    /**
     * 查看全部
     * @return
     */
    @ApiOperation("查看全部")
    @GetMapping("findAll")
    public Message findAll(){
        return MessageUtil.success(iAccountCustomerService.findAll());
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @ApiOperation("根据id查询")
    @GetMapping("selectById")
    public Message selectById(long id){
        return MessageUtil.success(iAccountCustomerService.selectById(id));
    }

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    @ApiOperation("根据用户id查询")
    @GetMapping("selectByUserId")
    public Message selectByUserId(long userId){
        return MessageUtil.success(iAccountCustomerService.selectByUserId(userId));
    }
}
