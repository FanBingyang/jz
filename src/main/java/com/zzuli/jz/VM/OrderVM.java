package com.zzuli.jz.VM;

import com.zzuli.jz.bean.Order;
import com.zzuli.jz.bean.OrderLine;

import java.util.List;

public class OrderVM extends Order {

    private List<OrderLine> orderLines;

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
