package com.zzuli.jz.service;

import com.zzuli.jz.bean.AccountCustomer;

import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/15 8:09
 * @Version 1.0
 */
public interface IAccountCustomerService {

    /**
     * 添加审核
     * @param accountCustomer
     */
    void save(AccountCustomer accountCustomer);

    /**
     * 查看全部
     */
    List<AccountCustomer> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    AccountCustomer selectById(long id);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    List<AccountCustomer> selectByUserId(long userId);
}
