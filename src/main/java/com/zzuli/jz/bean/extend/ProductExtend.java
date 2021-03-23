package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.Category;
import com.zzuli.jz.bean.Product;

/**
 * @Author yy
 * @Description 产品拓展类
 * @Date 2020/6/13 16:50
 * @Version 1.0
 */
public class ProductExtend extends Product {
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category=category;
    }
}
