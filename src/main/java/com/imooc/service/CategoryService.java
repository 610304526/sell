package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author 缪希灿
 * Created by max on 2018/3/25.
 */
public interface CategoryService {

    ProductCategory   findOne(Integer categoryId);

    ProductCategory  save(ProductCategory productCategory);

    List<ProductCategory>  findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
