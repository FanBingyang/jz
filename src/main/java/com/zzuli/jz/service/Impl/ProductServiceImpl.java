package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.Product;
import com.zzuli.jz.bean.ProductExample;
import com.zzuli.jz.bean.extend.ProductExtend;
import com.zzuli.jz.dao.ProductMapper;
import com.zzuli.jz.dao.extend.ProductExtendMapper;
import com.zzuli.jz.service.IProductService;
import com.zzuli.jz.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yy
 * @Description 产品业务实现类
 * @Date 2020/6/13 16:58
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;

    @Resource
    private ProductExtendMapper productExtendMapper;

    @Override
    public List<Product> findAll() {
        ProductExample example = new ProductExample();
        return productMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Product product) throws CustomerException {
        if (product.getId()!=null){
            productMapper.updateByPrimaryKey(product);
        }else {
            productMapper.insert(product);
        }
    }

    @Override
    public void deleteById(long id) throws CustomerException {
        //先判断该id对应的数据是否存在
        Product product = productMapper.selectByPrimaryKey(id);
        if (product == null){
            //不存在时，报错，删除
        throw new CustomerException("删除失败！要删除的数据不存在");
        }
        //存在时，删除
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProductExtend> findAllWithCategory(String name) {
        return productExtendMapper.selectAllWithCategory(name);
    }
}
