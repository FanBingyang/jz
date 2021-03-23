package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.AccountEmployee;
import com.zzuli.jz.service.IAccountEmployeeService;
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
 * @Date: 2020/6/15 8:30
 * @Version 1.0
 */
@Api(description = "员工账户管理接口")
@RestController
@RequestMapping("accountEmployeeController")
public class AccountEmployeeController {
    @Autowired
    private IAccountEmployeeService iAccountEmployeeService;

    /**
     * 提交审核
     * @param accountEmployee
     * @return
     */
    @ApiOperation("提交审核")
    @GetMapping("save")
    public Message save(AccountEmployee accountEmployee){
        iAccountEmployeeService.save(accountEmployee);
        return MessageUtil.success("保存成功");
    }

    /**
     * 查看全部
     * @return
     */
    @ApiOperation("查看全部")
    @GetMapping("findAll")
    public Message findAll(){
        return MessageUtil.success(iAccountEmployeeService.findAll());
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @ApiOperation("根据id查询")
    @GetMapping("selectById")
    public Message selectById(long id){
        return MessageUtil.success(iAccountEmployeeService.selectById(id));
    }

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    @ApiOperation("根据用户id查询")
    @GetMapping("selectByUserId")
    public Message selectByUserId(long userId){
        return MessageUtil.success(iAccountEmployeeService.selectByUserId(userId));
    }
}
