package com.zzuli.jz.utils;

import java.util.Date;

public class MessageUtil {
    /**
     * 返回失败消息，一般用于增删改操作的结果返回
     * */
    public static com.zzuli.jz.utils.Message error(String msg){
        com.zzuli.jz.utils.Message message = new com.zzuli.jz.utils.Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * 返回成功消息，一般用于增删改操作的结果返回
     * */
    public static com.zzuli.jz.utils.Message success(String msg){
        com.zzuli.jz.utils.Message message = new com.zzuli.jz.utils.Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    /**
     * 返回成功的消息，一般用于查询操作的结果返回
     * */
    public static com.zzuli.jz.utils.Message success(String msg, Object data){
        com.zzuli.jz.utils.Message message = new com.zzuli.jz.utils.Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * 返回成功的消息，一般用于查询操作的结果返回
     * */
    public static com.zzuli.jz.utils.Message success(Object data){
        com.zzuli.jz.utils.Message message = new com.zzuli.jz.utils.Message();
        message.setStatus(200);
        message.setMessage("success");
        message.setData(data);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * @Description: 权限不足
     * @Param: []
     * @return: com.jacky.base.utils.Message
     * @Author: charles
     * @Date: 2019-11-19
     */
    public static com.zzuli.jz.utils.Message forbidden(String msg){
        com.zzuli.jz.utils.Message message = new com.zzuli.jz.utils.Message();
        message.setStatus(403);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    /**
     * @Description: 未授权
     * @Param: []
     * @return: com.jacky.base.utils.Message
     * @Author: charles
     * @Date: 2019-11-19
     */
    public static com.zzuli.jz.utils.Message unAuthorized(String msg){
        com.zzuli.jz.utils.Message message = new com.zzuli.jz.utils.Message();
        message.setStatus(401);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }



}
