package com.zzuli.jz.service;

import com.zzuli.jz.bean.Category;
import com.zzuli.jz.bean.extend.CategoryExtend;
import com.zzuli.jz.utils.CustomerException;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void saveOrUpdate(Category category) throws CustomerException;

    void deleteById(long id) throws CustomerException;

    List<CategoryExtend> findAllWithChild(String name);


}
