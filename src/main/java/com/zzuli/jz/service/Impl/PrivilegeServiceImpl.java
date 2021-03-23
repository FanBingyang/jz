package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.PrivilegeExample;
import com.zzuli.jz.bean.Privilege;
import com.zzuli.jz.bean.extend.PrivilegeExtend;
import com.zzuli.jz.dao.PrivilegeMapper;
import com.zzuli.jz.dao.extend.PrivilegeExtendMapper;
import com.zzuli.jz.service.IPrivilegeService;
import com.zzuli.jz.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yy
 * @Description 权限业务实现类
 * @Date 2020/6/14 11:53
 * @Version 1.0
 */
@Service
public class PrivilegeServiceImpl implements IPrivilegeService {
    @Resource
    private PrivilegeMapper privilegeMapper;

    @Resource
    private PrivilegeExtendMapper privilegeExtendMapper;


    @Override
    public List<Privilege> findAll() {
        PrivilegeExample example = new PrivilegeExample();
        return privilegeMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Privilege privilege) throws ClassCastException{
        if (privilege.getId() != null){
            privilegeMapper.updateByPrimaryKey(privilege);
        }else {
            privilegeMapper.insert(privilege);
        }
    }

    @Override
    public void deleteById(long id) throws CustomerException{
        //先判断id对应的数据是否存在
        Privilege privilege = privilegeMapper.selectByPrimaryKey(id);
        if (privilege == null){
            throw new CustomerException("删除失败，要删除的数据不存在！");
        }
        privilegeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PrivilegeExtend> findAllWithChild() {
        return privilegeExtendMapper.selectAllWithChild();
    }

}
