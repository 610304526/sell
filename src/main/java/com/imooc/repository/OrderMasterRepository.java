package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *<p>Title: ContentServiceImpl</p>
 *<p>Description: </p>
 *@Author  缪希灿
 *@Date  2018/3/28  18:03
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    /**
     * 查询订单  通过   买家id
     * @param buyerOpenid  买家的微信号
     * @param pageable  分页
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
