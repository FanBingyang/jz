package com.zzuli.jz.service;

import com.zzuli.jz.bean.RolePrivilege;

import java.util.List;

/**
 * @Author yy
 * @Description  角色权限接口
 * @Date 2020/6/14 10:11
 * @Version 1.0
 */
public interface IRolePrivilegeService {
    List<RolePrivilege> findAll();

    /**
     * 根据角色id进行查询
     * @param roleId
     * @return
     */
    List<RolePrivilege> findByRoleId(long roleId);

    /*/**
     *
     * @Author  yy
     * @Description  根据权限id进行查询
     * @Date  2020/6/14 19:05
     * @Version  1.0
     *
     **/
    List<RolePrivilege> findByPrivilegeId(long privilegeId);
}
