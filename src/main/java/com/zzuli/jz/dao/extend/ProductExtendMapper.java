package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.extend.ProductExtend;

import java.util.List;

/**
 * @Author yy
 * @Description 产品接口
 * @Date 2020/6/13 16:54
 * @Version 1.0
 */
public interface ProductExtendMapper {
    List<ProductExtend> selectAllWithCategory(String name);

}
