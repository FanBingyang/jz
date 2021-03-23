package com.zzuli.jz.service;

import com.zzuli.jz.bean.Address;
import com.zzuli.jz.bean.Product;
import com.zzuli.jz.bean.extend.AddressExtend;
import com.zzuli.jz.utils.CustomerException;

import java.util.List;

/**
 * @Author yy
 * @Description 地址业务接口
 * @Date 2020/6/13 21:58
 * @Version 1.0
 */
public interface IAddressService {
    List<Address> findAll();

    void saveOrUpdate(Address address) throws CustomerException;

    void deleteById(long id) throws CustomerException;

    List<AddressExtend> findAllWithUser();
}
