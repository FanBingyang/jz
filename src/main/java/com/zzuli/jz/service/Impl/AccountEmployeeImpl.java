package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.AccountCustomerExample;
import com.zzuli.jz.bean.AccountEmployee;
import com.zzuli.jz.bean.AccountEmployeeExample;
import com.zzuli.jz.dao.AccountEmployeeMapper;
import com.zzuli.jz.service.IAccountEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/15 8:10
 * @Version 1.0
 */
@Service
public class AccountEmployeeImpl implements IAccountEmployeeService {

    @Resource
    private AccountEmployeeMapper accountEmployeeMapper;

    /**
     * 添加审核
     *
     * @param accountEmployee
     */
    @Override
    public void save(AccountEmployee accountEmployee) {
        accountEmployeeMapper.insert(accountEmployee);
    }

    /**
     * 查看全部
     */
    @Override
    public List<AccountEmployee> findAll() {
        return accountEmployeeMapper.selectByExample(new AccountEmployeeExample());
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public AccountEmployee selectById(long id) {
        return accountEmployeeMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    @Override
    public List<AccountEmployee> selectByUserId(long userId) {
        AccountEmployeeExample example = new AccountEmployeeExample();
        AccountEmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return accountEmployeeMapper.selectByExample(example);
    }
}

