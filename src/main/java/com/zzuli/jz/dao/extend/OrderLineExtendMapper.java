package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.OrderLine;

import java.util.List;

public interface OrderLineExtendMapper {
    List<OrderLine> selectByOrderId(long id);
}
