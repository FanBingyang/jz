package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.Role;
import com.zzuli.jz.bean.User;
import com.zzuli.jz.bean.UserExample;
import com.zzuli.jz.bean.extend.UserExtend;
import com.zzuli.jz.dao.UserMapper;
import com.zzuli.jz.dao.extend.UserExtendMapper;
import com.zzuli.jz.service.IUserService;
import com.zzuli.jz.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: FBY
 * @Date: 2020/6/12 17:06
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public User findById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserExtendMapper userExtendMapper;


    /**
     * 查看全部用户
     *
     * @return
     */
    @Override
    public List<User> findAll() throws CustomerException {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public List<UserExtend> findAllEmployee() throws CustomerException{
        return userExtendMapper.selectAllEmployee();
    }

    /**
     * 保存或者更新用户
     *
     * @param user
     */
    @Override
    public void saveOrUpdate(User user) throws CustomerException {
        if (user.getId() != null){
            userMapper.updateByPrimaryKey(user);
        }else {
            userMapper.insert(user);
        }
    }

    /**
     * 根据id删除用户
     *
     * @param id
     */
    @Override
    public void deleteById(long id) throws CustomerException {
        userMapper.deleteByPrimaryKey(id);
    }

    /**
     * 多条件查询用户
     *
     * @param user
     * @return
     * @throws CustomerException
     */
    @Override
    public List<User> findExample(User user) throws CustomerException {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        // 不去重
        example.setDistinct(false);

        // 姓名模糊查询
        if (user.getRealname() != null){
            criteria.andRealnameLike('%'+user.getRealname()+'%');
        }
        // 电话号码模糊查询
        if(user.getTelephone() != null){
            criteria.andTelephoneLike('%'+user.getTelephone()+'%');
        }
        // 用户性别查询
        if(user.getGender() != null){
            criteria.andGenderEqualTo(user.getGender());
        }
        // 状态查询
        if(user.getStatus() != null){
            criteria.andStatusEqualTo(user.getStatus());
        }

        List<User> list = userMapper.selectByExample(example);
        return list;
    }

    /**
     * 查询所有用户权限
     *
     * @return
     */
    @Override
    public List<UserExtend> findAllWithRole() throws CustomerException {
        return userExtendMapper.selectAllWithRole();
    }
}
