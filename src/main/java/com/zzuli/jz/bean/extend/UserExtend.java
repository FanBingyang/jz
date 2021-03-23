package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.Role;
import com.zzuli.jz.bean.User;

/**
 * @Author: FBY
 * @Date: 2020/6/12 16:39
 * @Version 1.0
 */
public class UserExtend extends User {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
