package com.zzuli.jz.service;

import com.zzuli.jz.bean.AccountSystem;

import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/15 8:11
 * @Version 1.0
 */
public interface IAccountSystemService {

    /**
     * 添加审核
     * @param accountSystem
     */
    void save(AccountSystem accountSystem);

    /**
     * 查看全部
     */
    List<AccountSystem> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    AccountSystem selectById(long id);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    List<AccountSystem> selectByUserId(long userId);
}
