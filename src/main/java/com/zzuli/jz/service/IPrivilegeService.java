package com.zzuli.jz.service;

import com.zzuli.jz.bean.Privilege;
import com.zzuli.jz.bean.extend.PrivilegeExtend;
import com.zzuli.jz.utils.CustomerException;

import java.util.List;

/**
 * @Author yy
 * @Description 权限业务接口
 * @Date 2020/6/14 11:51
 * @Version 1.0
 */
public interface IPrivilegeService {
    List<Privilege> findAll();

    void saveOrUpdate(Privilege privilege) throws CustomerException;

    void deleteById(long id) throws CustomerException;

    List<PrivilegeExtend> findAllWithChild();
}
