package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.AccountCustomer;
import com.zzuli.jz.bean.AccountCustomerExample;
import com.zzuli.jz.dao.AccountCustomerMapper;
import com.zzuli.jz.service.IAccountCustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/15 8:09
 * @Version 1.0
 */
@Service
public class AccountCustomerImpl implements IAccountCustomerService {

    @Resource
    private AccountCustomerMapper accountCustomerMapper;

    /**
     * 添加审核
     *
     * @param accountCustomer
     */
    @Override
    public void save(AccountCustomer accountCustomer) {
        accountCustomerMapper.insert(accountCustomer);
    }

    /**
     * 查看全部
     */
    @Override
    public List<AccountCustomer> findAll() {
        return accountCustomerMapper.selectByExample(new AccountCustomerExample());
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public AccountCustomer selectById(long id) {
        return accountCustomerMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    @Override
    public List<AccountCustomer> selectByUserId(long userId) {
        AccountCustomerExample example = new AccountCustomerExample();
        AccountCustomerExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return accountCustomerMapper.selectByExample(example);
    }
}
