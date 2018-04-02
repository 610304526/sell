package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * Created by 缪希灿
 * 判断是否是买家
 * @Email : 610304526@qq.com
 * 2018/3/29   15:51
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}
