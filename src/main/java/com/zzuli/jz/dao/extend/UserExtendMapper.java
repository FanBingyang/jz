package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.extend.UserExtend;

import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/12 16:40
 * @Version 1.0
 */
public interface UserExtendMapper {

    List<UserExtend> selectAllWithRole();

    List <UserExtend> selectAllEmployee();
}
