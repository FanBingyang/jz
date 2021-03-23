package com.zzuli.jz.bean.extend;

import com.zzuli.jz.bean.Address;
import com.zzuli.jz.bean.Order;
import com.zzuli.jz.bean.OrderLine;
import com.zzuli.jz.bean.User;

import java.util.List;

public class OrderExtend {

    public static final String STATUS_DZF="待支付";
    public static final String STATUS_DPD="待派单";
    public static final String STATUS_DFW="待服务";
    public static final String STATUS_DQR="待确认";
    public static final String STATUS_YWC="已完成";

    private User customer;
    private User employee;
    private Address address;
    private Order order;

    private List<OrderLine> orderLines;

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
