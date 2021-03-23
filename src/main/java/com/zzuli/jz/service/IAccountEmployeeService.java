package com.zzuli.jz.service;

import com.zzuli.jz.bean.AccountEmployee;

import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/15 8:10
 * @Version 1.0
 */
public interface IAccountEmployeeService {

    /**
     * 添加审核
     * @param accountEmployee
     */
    void save(AccountEmployee accountEmployee);

    /**
     * 查看全部
     */
    List<AccountEmployee> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    AccountEmployee selectById(long id);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    List<AccountEmployee> selectByUserId(long userId);
}
