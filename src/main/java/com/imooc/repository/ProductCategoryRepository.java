package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *<p>Title: ProductCategoryRepository</p>
 *<p>Description: 类目的接口 </p>
 * @version 1.0
 *@Author  缪希灿
 *@Email:610304526@qq.com
 *@Date  2018/3/25  3:52
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
