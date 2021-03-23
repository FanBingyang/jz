package com.zzuli.jz.service.Impl;

import com.zzuli.jz.bean.Category;
import com.zzuli.jz.bean.CategoryExample;
import com.zzuli.jz.bean.extend.CategoryExtend;
import com.zzuli.jz.dao.CategoryMapper;
import com.zzuli.jz.dao.extend.CategoryExtendMapper;
import com.zzuli.jz.service.ICategoryService;
import com.zzuli.jz.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private CategoryExtendMapper categoryExtendMapper;

    @Override
    public List<CategoryExtend> findAllWithChild(String name){
        return categoryExtendMapper.selectAllWithChild(name);
    }

    @Override
    public List<Category> findAll(){
        CategoryExample example = new CategoryExample();
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Category category) throws ClassCastException{
        if (category.getId() != null){
            categoryMapper.updateByPrimaryKey(category);
        }else{
            categoryMapper.insert(category);
        }
    }

    public void deleteById(long id) throws CustomerException{
        //先判断id对应的数据是否存在
        Category category = categoryMapper.selectByPrimaryKey(id);
        if (category == null){
            throw new CustomerException("删除失败，要删除的数据不存在！");
        }
        categoryMapper.deleteByPrimaryKey(id);
    }

}
