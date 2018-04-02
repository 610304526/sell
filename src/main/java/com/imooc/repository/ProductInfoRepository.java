package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品信息接口
 * @Author 缪希灿
 * Created by max on 2018/3/25. 14:07
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    
    /**
     *<p>Title:查询商品列表通过商品状态</p>
     *<p>Description: </p>
     *@Author  缪希灿
     *@Date  2018/3/25  15:03
     */
    List<ProductInfo>  findByProductStatus(Integer productStatus);

}
