package com.zzuli.jz.web.controller;

import com.zzuli.jz.bean.RolePrivilege;
import com.zzuli.jz.service.IRolePrivilegeService;
import com.zzuli.jz.utils.Message;
import com.zzuli.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yy
 * @Description 角色权限控制器
 * @Date 2020/6/14 10:25
 * @Version 1.0
 */
@RestController
@RequestMapping("/rolePrivilege")
@Api(description = "角色权限管理接口")
public class RolePrivilegeController {
        @Autowired
        private IRolePrivilegeService rolePrivilegeService;

        /**
         * 查询所有角色权限，并且级联所属角色
         * @return
         */
        @ApiOperation(value="查找所有角色权限信息")
        @GetMapping("/findAll")
        public Message findAll(){
            List<RolePrivilege> list = rolePrivilegeService.findAll();
            return  MessageUtil.success(list);
        }


        @ApiOperation(value="根据角色id进行查询")
        @GetMapping("/findByRoleId")
        public Message findByRoleId(long roleId){
            List<RolePrivilege> list = rolePrivilegeService.findByRoleId(roleId);
            return MessageUtil.success(list);
        }

        @ApiOperation(value="根据角色权限id进行查询")
        @GetMapping("/findByPrivilegeId")
        public Message findByPrivilegeId(long privilegeId){
            List<RolePrivilege> list = rolePrivilegeService.findByPrivilegeId(privilegeId);
            return MessageUtil.success(list);
        }


}
