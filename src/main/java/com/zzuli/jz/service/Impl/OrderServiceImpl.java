package com.zzuli.jz.service.Impl;

import com.zzuli.jz.VM.OrderVM;
import com.zzuli.jz.bean.Order;
import com.zzuli.jz.bean.OrderExample;
import com.zzuli.jz.bean.OrderLine;
import com.zzuli.jz.bean.extend.OrderExtend;
import com.zzuli.jz.dao.*;
import com.zzuli.jz.dao.extend.OrderExtendMapper;
import com.zzuli.jz.service.IOrderService;
import com.zzuli.jz.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    public OrderMapper orderMapper;

    @Resource
    private OrderExtendMapper orderExtendMapper;

    @Resource
    private OrderLineMapper orderLineMapper;

    @Resource
    private AddressMapper addressMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private ProductMapper productMapper;


    @Override
    public List<Order> findAll() {
        return orderMapper.selectByExample(new OrderExample());
    }

    @Override
    public OrderExtend findOrderDetailsById(long id) {
        return orderExtendMapper.selectById(id);
    }

    /**
     * 通过id修改订单状态
     *
     * @param id
     * @param status
     */
    @Override
    public int updateStatusById(long id, String status) {
        Order order = new Order();
        order.setId(id);
        order.setStatus(status);
        return orderMapper.updateByPrimaryKeySelective(order);
    }

    /**
     * 通过订单状态查询订单
     *
     * @param status
     * @return
     */
    @Override
    public List<OrderExtend> selectByStatus(String status) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        if(status != null){
            criteria.andStatusEqualTo(status);
        }

        List<Order> orderList = orderMapper.selectByExample(example);
        List list = new ArrayList();
        // 查询出关联数据
        for(Order o:orderList){
            list.add(orderExtendMapper.selectById(o.getId()));
        }
        return list;
    }

    /**
     * 通过顾客id查询订单
     *
     * @param customerId
     * @return
     */
    @Override
    public List<OrderExtend> selectByCustomerId(long customerId) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);
        List<Order> orderList = orderMapper.selectByExample(example);
        List list = new ArrayList();
        // 查询出关联数据
        for(Order o:orderList){
            list.add(orderExtendMapper.selectById(o.getId()));
        }
        return list;
    }

    /**
     * 通过顾客id查询订单+订单状态查询
     *
     * @param customerId
     * @param status
     * @return
     */
    @Override
    public List<OrderExtend> selectByCustomerIdAndStatus(long customerId, String status) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerIdEqualTo(customerId);
        criteria.andStatusEqualTo(status);
        List<Order> orderList = orderMapper.selectByExample(example);
        List list = new ArrayList();
        // 查询出关联数据
        for(Order o:orderList){
            list.add(orderExtendMapper.selectById(o.getId()));
        }
        return list;
    }

    /**
     * 通过员工id查询订单
     *
     * @param employeeId
     * @return
     */
    @Override
    public List<OrderExtend> selectByEmployeeId(long employeeId) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andEmployeeIdEqualTo(employeeId);
        List<Order> orderList = orderMapper.selectByExample(example);
        List list = new ArrayList();
        // 查询出关联数据
        for(Order o:orderList){
            list.add(orderExtendMapper.selectById(o.getId()));
        }
        return list;
    }

    /**
     * 通过员工id查询订单+订单状态查询
     *
     * @param employeeId
     * @param status
     * @return
     */
    @Override
    public List<OrderExtend> selectByEmployeeIdAndStatus(long employeeId, String status) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andEmployeeIdEqualTo(employeeId);
        criteria.andStatusEqualTo(status);
        List<Order> orderList = orderMapper.selectByExample(example);
        List list = new ArrayList();
        // 查询出关联数据
        for(Order o:orderList){
            list.add(orderExtendMapper.selectById(o.getId()));
        }
        return list;
    }



    @Override
    public void commit(OrderVM orderVM) throws CustomerException{
        /*
         * 1. 分别获取到订单信息 及订单项信息
         * 2. 先保存订单信息
         * 3. 保存订单项信息
         * */
        Order order = new Order();
        order.setTotal(orderVM.getTotal());
        order.setAddressId(orderVM.getAddressId());
        order.setCustomerId(orderVM.getCustomerId());
        order.setEmployeeId(orderVM.getEmployeeId());
        order.setOrderTime(new Date().getTime());
        order.setStatus(OrderExtend.STATUS_DZF);

        List<OrderLine> orderLines = orderVM.getOrderLines();

        orderMapper.insert(order);

        for(OrderLine orderLine : orderLines){
            // 设置order与orderline之间的关键（外键维护）
            orderLine.setOrderId(order.getId());
            orderLineMapper.insert(orderLine);
        }

    }
}
