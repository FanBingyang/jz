package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.extend.PrivilegeExtend;
import java.util.List;

/**
 * @Author yy
 * @Description 权限的接口
 * @Date 2020/6/14 11:49
 * @Version 1.0
 */
public interface PrivilegeExtendMapper {
    List<PrivilegeExtend> selectAllWithChild();
}
