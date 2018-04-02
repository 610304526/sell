package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @version 1.0
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/25. 16:04
 */
public interface ProductService {

    ProductInfo   findOne(String productId);

    /**
     *<p>Title:查询所有在架商品 </p>
     *<p>Description:  </p>
     *@Author  缪希灿
     *@Date  2018/3/25  16:07
     */
    List<ProductInfo>  findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo  save(ProductInfo productInfo);
    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);
}
