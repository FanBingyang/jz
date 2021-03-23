package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.Privilege;

import java.util.List;

/**
 * @Author yy
 * @Description 权限拓展类
 * @Date 2020/6/14 11:03
 * @Version 1.0
 */
public class PrivilegeExtend extends Privilege {
    private List<Privilege> children;

    public List<Privilege> getChildren() {
        return children;
    }

    public void setChildren(List<Privilege> children) {
        this.children=children;
    }
}
