package com.zzuli.jz.service;

import com.zzuli.jz.bean.User;
import com.zzuli.jz.bean.UserExample;
import com.zzuli.jz.bean.extend.UserExtend;
import com.zzuli.jz.utils.CustomerException;

import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/12 16:44
 * @Version 1.0
 */
public interface IUserService {

    /**
     * 查看全部用户
     * @return
     */
    List<User> findAll();


    /**
     * 查看全部员工
     * @return
     */
    List<UserExtend> findAllEmployee();


    /**
     * 通过id查询
     * @return
     */
    User findById(long id);

    /**
     * 保存或者更新用户
     * @param user
     */
    void saveOrUpdate(User user) throws CustomerException;

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteById(long id) throws CustomerException;

    /**
     * 查询所有用户权限
     * @return
     */
    List<UserExtend> findAllWithRole() throws CustomerException;

    /**
     * 多条件查询用户
     * @param user
     * @return
     * @throws CustomerException
     */
    List<User> findExample(User user) throws CustomerException;
}
