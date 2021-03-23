package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.Address;
import com.zzuli.jz.bean.User;

/**
 * @Author yy
 * @Description 地址拓展类
 * @Date 2020/6/13 21:32
 * @Version 1.0
 */
public class AddressExtend extends Address {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }
}
