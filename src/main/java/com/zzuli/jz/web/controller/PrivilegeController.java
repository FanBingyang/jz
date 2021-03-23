package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.Privilege;
import com.zzuli.jz.bean.extend.PrivilegeExtend;
import com.zzuli.jz.service.IPrivilegeService;
import com.zzuli.jz.utils.MessageUtil;
import com.zzuli.jz.utils.Message;
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
 * @Description 权限控制器
 * @Date 2020/6/14 11:57
 * @Version 1.0
 */

@RestController
@RequestMapping("/privilege")
@Api(description="权限管理接口")
public class PrivilegeController {
    @Autowired
    private IPrivilegeService privilegeService;

    @ApiOperation(value = "查找所有权限信息")
    @GetMapping("/findAll")
    public Message findAll(){
        List<Privilege> list = privilegeService.findAll();
        return MessageUtil.success(list);
    }


    @ApiOperation(value = "通过id删除权限信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "唯一编号",required = true,paramType = "query")
    })
    @GetMapping("deleteById")
    public Message deleteById(long id){
        privilegeService.deleteById(id);
        return MessageUtil.success("删除成功！");
    }

    @ApiOperation(value = "新增或更新权限信息")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Privilege privilege){
        privilegeService.saveOrUpdate(privilege);
        return MessageUtil.success("保存成功！");
    }

    @ApiOperation(value = "查找权限信息以及子信息")
    @GetMapping("findAllWithChild")
    public Message findAllWithChild(){
        List<PrivilegeExtend> list = privilegeService.findAllWithChild();
        return MessageUtil.success(list);
    }
}
