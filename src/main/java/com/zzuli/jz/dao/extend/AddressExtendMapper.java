package com.zzuli.jz.dao.extend;

import com.zzuli.jz.bean.extend.AddressExtend;

import java.util.List;

/**
 * @Author yy
 * @Description 地址接口
 * @Date 2020/6/13 21:56
 * @Version 1.0
 */
public interface AddressExtendMapper {
    List<AddressExtend> selectAllWithUser();
}
