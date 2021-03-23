package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.User;
import com.zzuli.jz.bean.extend.UserExtend;
import com.zzuli.jz.service.IUserService;
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
 * @Author: FBY
 * @Date: 2020/6/12 17:28
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
@Api(description = "用户管理接口")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "查看所有用户")
    @GetMapping("findAllWithCategory")
    public Message findAllWithCategory(){
        List<User> list = userService.findAll();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "查看所有员工")
    @GetMapping("findAllEmployee")
    public Message findAllEmployee(){
        return MessageUtil.success(userService.findAllEmployee());
    }

    @GetMapping("auditing")
    public Message auditing(long id){
        User user = userService.findById(id);
        user.setStatus("启用");
        userService.saveOrUpdate(user);
        return MessageUtil.success("审核成功");
    }

    /**
     * 拒绝用户审核
     * @param id
     * @return
     */
    @ApiOperation(value = "拒绝用户审核")
    @GetMapping("refuseAuditing")
    public Message refuseAuditing(long id){
        User user =  userService.findById(id);
        user.setStatus("禁用");
        userService.saveOrUpdate(user);
        return MessageUtil.success("已拒绝审核");
    }


    @ApiOperation(value = "保存或者更新用户信息")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(User user){
        userService.saveOrUpdate(user);
        return MessageUtil.success("保存成功");
    }

    @ApiOperation(value = "通过id删除用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id" ,value = "唯一编号", required = true, paramType = "query")
    })
    @GetMapping("deleteById")
    public Message deleteById(long id){
        userService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    /**
     * 查询所有用户，并且级连获得用户角色
     * @return
     */
    @ApiOperation(value = "查询所有用户并且级连获得用户角色")
    @GetMapping("findAllWithRole")
    public Message findAllWithRole(){
        List<UserExtend> list = userService.findAllWithRole();
        return MessageUtil.success(list);
    }

    /**
     * 多条件查询用户信息
     * @param
     * @return
     */
    @ApiOperation(value = "多条件查询用户信息")
    @PostMapping("findExample")
    public Message findExample(String realName,String gender,String status,String telephone){
        User user = new User();
        user.setRealname(realName);
        user.setGender(gender);
        user.setTelephone(telephone);
        user.setStatus(status);
        List<User> list = userService.findExample(user);
        return MessageUtil.success(list);
    }
}
