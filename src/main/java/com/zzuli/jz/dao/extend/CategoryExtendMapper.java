package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.extend.CategoryExtend;

import java.util.List;

public interface CategoryExtendMapper {

    List<CategoryExtend> selectAllWithChild(String name);
}
