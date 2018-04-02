package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @version 1.0
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/26. 14:55
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    /***
     * 商品订单查询 通过订单
     * @param orderId  订单id
     * @return  商品集合
     */
    List<OrderDetail> findByOrderId(String orderId);
}
