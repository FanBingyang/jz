package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.Address;
import com.zzuli.jz.bean.AddressExample;
import com.zzuli.jz.bean.extend.AddressExtend;
import com.zzuli.jz.dao.AddressMapper;
import com.zzuli.jz.dao.extend.AddressExtendMapper;
import com.zzuli.jz.service.IAddressService;
import com.zzuli.jz.utils.CustomerException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yy
 * @Description 地址业务实现类
 * @Date 2020/6/13 22:08
 * @Version 1.0
 */
@Service
public class AddressServiceImpl implements IAddressService {
    @Resource
    private AddressMapper addressMapper;

    @Resource
    private AddressExtendMapper addressExtendMapper;

    @Override
    public List<Address> findAll() {
        AddressExample example = new AddressExample();
        return addressMapper.selectByExample(example);
    }


    @Override
    public void saveOrUpdate(Address address) throws CustomerException {
        if (address.getId()!=null){
            addressMapper.updateByPrimaryKey(address);
        }else {
            addressMapper.insert(address);
        }
    }


    @Override
    public void deleteById(long id) throws CustomerException {
        //先判断该id对应的数据是否存在
        Address address = addressMapper.selectByPrimaryKey(id);
        if (address == null){
            //不存在时，报错，删除
            throw new CustomerException("删除失败！要删除的数据不存在");
        }
        //存在时，删除
        addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<AddressExtend> findAllWithUser() {
        return addressExtendMapper.selectAllWithUser();
    }


}
