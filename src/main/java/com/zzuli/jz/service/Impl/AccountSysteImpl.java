package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.AccountSystem;
import com.zzuli.jz.bean.AccountSystemExample;
import com.zzuli.jz.dao.AccountSystemMapper;
import com.zzuli.jz.service.IAccountSystemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/15 8:11
 * @Version 1.0
 */
@Service
public class AccountSysteImpl implements IAccountSystemService {

    @Resource
    private AccountSystemMapper accountSystemMapper;

    /**
     * 添加审核
     *
     * @param accountSystem
     */
    @Override
    public void save(AccountSystem accountSystem) {
        accountSystemMapper.insert(accountSystem);
    }

    /**
     * 查看全部
     */
    @Override
    public List<AccountSystem> findAll() {
        return accountSystemMapper.selectByExample(new AccountSystemExample());
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public AccountSystem selectById(long id) {
        return accountSystemMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    @Override
    public List<AccountSystem> selectByUserId(long userId) {
        AccountSystemExample example = new AccountSystemExample();
        AccountSystemExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return accountSystemMapper.selectByExample(example);
    }
}
