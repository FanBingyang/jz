package com.zzuli.jz.web.controller;

import com.zzuli.jz.VM.OrderVM;
import com.zzuli.jz.bean.extend.OrderExtend;
import com.zzuli.jz.service.IOrderService;
import com.zzuli.jz.utils.Message;
import com.zzuli.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "订单管理接口")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("commit")
    @ApiOperation("提交订单")
    public Message commit(@RequestBody OrderVM orderVM){

        orderService.commit(orderVM);
        return MessageUtil.success("提交成功！");
    }

    @GetMapping("findAll")
    @ApiOperation("查询全部")
    public Message findAll(){
        return MessageUtil.success("success",orderService.findAll());
    }

    @GetMapping("findById")
    @ApiOperation("通过id查询")
    public Message findById(long id){
        return MessageUtil.success("success",orderService.findOrderDetailsById(id));
    }

    /**
     * 通过id修改订单状态
     * @param id
     * @param stauts
     * @return
     */
    @ApiOperation(value = "通过id修改订单状态")
    @PostMapping("updateStatusById")
    public Message updateStatusById(long id,String stauts){
        int flag = orderService.updateStatusById(id,stauts);
        if (flag == 1){
            return MessageUtil.success("更新成功");
        }
        else return MessageUtil.error("更新失败");
    }

    /**
     * 通过订单状态查询订单
     * @param status
     * @return
     */
    @ApiOperation(value = "通过订单状态查询订单")
    @GetMapping("selectByStatus")
    public Message selectByStatus(String status){
        List<OrderExtend> list = orderService.selectByStatus(status);
        return MessageUtil.success(list);
    }

    /**
     * 通过顾客id查询订单
     * @param customerId
     * @return
     */
    @ApiOperation(value = "通过顾客id查询订单")
    @GetMapping("selectByCustomerId")
    public Message selectByCustomerId(long customerId){
        List<OrderExtend> list = orderService.selectByCustomerId(customerId);
        return MessageUtil.success(list);
    }

    /**
     * 通过顾客id查询订单+订单状态查询
     * @param customerId
     * @param status
     * @return
     */
    @ApiOperation(value = "通过顾客id和订单状态查询")
    @GetMapping("selectByCustomerIdAndStatus")
    public Message selectByCustomerIdAndStatus(long customerId,String status){
        List<OrderExtend> list = orderService.selectByCustomerIdAndStatus(customerId,status);
        return MessageUtil.success(list);
    }

    /**
     * 通过员工id查询订单
     * @param employeeId
     * @return
     */
    @ApiOperation(value = "通过员工id查询订单")
    @GetMapping("selectByEmployeeId")
    public Message selectByEmployeeId(long employeeId){
        List<OrderExtend> list = orderService.selectByEmployeeId(employeeId);
        return MessageUtil.success(list);
    }

    /**
     * 通过员工id查询订单+订单状态查询
     * @param employeeId
     * @param status
     * @return
     */
    @ApiOperation(value = "通过员工id和订单状态查询")
    @GetMapping("selectByEmployeeIdAndStatus")
    public Message selectByEmployeeIdAndStatus(long employeeId, String status){
        List<OrderExtend> list = orderService.selectByEmployeeIdAndStatus(employeeId,status);
        return MessageUtil.success(list);
    }






}
