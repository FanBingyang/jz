package com.zzuli.jz.service.Impl;


import com.zzuli.jz.bean.RolePrivilege;
import com.zzuli.jz.bean.RolePrivilegeExample;
import com.zzuli.jz.dao.RolePrivilegeMapper;
import com.zzuli.jz.dao.extend.RolePrivilegeExtendMapper;
import com.zzuli.jz.service.IRolePrivilegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yy
 * @Description 角色权限实现类
 * @Date 2020/6/14 10:16
 * @Version 1.0
 */
@Service
public class RolePrivilegeServiceImpl implements IRolePrivilegeService {
    @Resource
    private RolePrivilegeMapper rolePrivilegeMapper;
    @Resource
    private RolePrivilegeExtendMapper rolePrivilegeExtendMapper;


    @Override
    public List<RolePrivilege> findAll() {
        RolePrivilegeExample example = new RolePrivilegeExample();
        return rolePrivilegeMapper.selectByExample(example);
    }

    /**
     * 根据角色id进行查询
     *
     * @param roleId
     * @return
     */
    @Override
    public List<RolePrivilege> findByRoleId(long roleId) {
//        RolePrivilegeExample example = new RolePrivilegeExample();
//
//        RolePrivilegeExample.Criteria criteria = example.createCriteria();
//
//        criteria.andRoleIdEqualTo(roleId);
//
//        return rolePrivilegeMapper.selectByExample(example);

        return rolePrivilegeExtendMapper.selectByRoleId(roleId);


    }

    @Override
    public List<RolePrivilege> findByPrivilegeId(long privilegeId) {
        return rolePrivilegeExtendMapper.selectByPrivilegeId(privilegeId);
    }
}
