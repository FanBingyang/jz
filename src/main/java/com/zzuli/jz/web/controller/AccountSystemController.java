package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.AccountSystem;
import com.zzuli.jz.service.IAccountSystemService;
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
 * @Date: 2020/6/15 8:23
 * @Version 1.0
 */
@Api(description = "系统账户管理接口")
@RestController
@RequestMapping("accountSystemMapper")
public class AccountSystemController {

    @Autowired
    private IAccountSystemService iAccountSystemService;

    /**
     * 提交审核
     * @param accountSystem
     * @return
     */
    @ApiOperation("提交审核")
    @GetMapping("save")
    public Message save(AccountSystem accountSystem){
        iAccountSystemService.save(accountSystem);
        return MessageUtil.success("保存成功");
    }

    /**
     * 查看全部
     * @return
     */
    @ApiOperation("查看全部")
    @GetMapping("findAll")
    public Message findAll(){
        return MessageUtil.success(iAccountSystemService.findAll());
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @ApiOperation("根据id查询")
    @GetMapping("selectById")
    public Message selectById(long id){
        return MessageUtil.success(iAccountSystemService.selectById(id));
    }

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    @ApiOperation("根据用户id查询")
    @GetMapping("selectByUserId")
    public Message selectByUserId(long userId){
        return MessageUtil.success(iAccountSystemService.selectByUserId(userId));
    }
}
