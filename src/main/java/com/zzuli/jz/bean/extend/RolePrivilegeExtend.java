package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.Privilege;
import com.zzuli.jz.bean.Role;
import com.zzuli.jz.bean.RolePrivilege;

/**
 * @Author yy
 * @Description 角色权限拓展类
 * @Date 2020/6/14 10:02
 * @Version 1.0
 */
public class RolePrivilegeExtend extends RolePrivilege {
    private Role role;
    private Privilege privilege;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role=role;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege=privilege;
    }
}
