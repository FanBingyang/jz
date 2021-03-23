package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.RolePrivilege;

import java.util.List;

/**
 * @Author yy
 * @Description 角色权限接口
 * @Date 2020/6/14 10:08
 * @Version 1.0
 */
public interface RolePrivilegeExtendMapper {

     List<RolePrivilege> selectByRoleId(long roleId);

     List<RolePrivilege> selectByPrivilegeId(long privilegeId);
}
