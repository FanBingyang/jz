package com.zzuli.jz.service;

import com.zzuli.jz.VM.OrderVM;
import com.zzuli.jz.bean.Order;
import com.zzuli.jz.bean.extend.OrderExtend;
import com.zzuli.jz.utils.CustomerException;

import java.util.List;

public interface IOrderService {

    void commit(OrderVM orderVM) throws CustomerException;

    List<Order> findAll();

    OrderExtend findOrderDetailsById(long id);

    /**
     * 通过id修改订单状态
     * @param id
     * @param status
     */
    int updateStatusById(long id,String status);

    /**
     * 通过订单状态查询订单
     * @param status
     * @return
     */
    List<OrderExtend> selectByStatus(String status);

    /**
     * 通过顾客id查询订单
     * @param customerId
     * @return
     */
    List<OrderExtend> selectByCustomerId(long customerId);

    /**
     * 通过顾客id查询订单+订单状态查询
     * @param customerId
     * @param status
     * @return
     */
    List<OrderExtend> selectByCustomerIdAndStatus(long customerId,String status);

    /**
     * 通过员工id查询订单
     * @param employeeId
     * @return
     */
    List<OrderExtend> selectByEmployeeId(long employeeId);

    /**
     * 通过员工id查询订单+订单状态查询
     * @param employeeId
     * @param status
     * @return
     */
    List<OrderExtend> selectByEmployeeIdAndStatus(long employeeId,String status);


}
