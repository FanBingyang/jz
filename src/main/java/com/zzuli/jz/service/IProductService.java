package com.zzuli.jz.service;

import com.zzuli.jz.bean.Product;
import com.zzuli.jz.bean.extend.ProductExtend;
import com.zzuli.jz.utils.CustomerException;

import java.util.List;

/**
 * @Author yy
 * @Description 产品业务接口
 * @Date 2020/6/13 16:56
 * @Version 1.0
 */
public interface IProductService {
    List<Product> findAll();

    void saveOrUpdate(Product product) throws CustomerException;

    void deleteById(long id) throws CustomerException;

    List<ProductExtend> findAllWithCategory(String name);
}
