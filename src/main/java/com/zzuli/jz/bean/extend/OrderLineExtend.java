package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.OrderLine;
import com.zzuli.jz.bean.Product;

/**订单项的拓展类**/
public class OrderLineExtend extends OrderLine {
        private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
