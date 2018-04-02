package com.imooc.controller;

import com.imooc.dataobject.ProductCategory;
import com.imooc.dataobject.ProductInfo;
import com.imooc.service.CategoryService;
import com.imooc.service.ProductService;
import com.imooc.utils.ResultVOUtil;
import com.imooc.vo.ProductInfoVo;
import com.imooc.vo.ProductVO;
import com.imooc.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 1.0
 * 买家商品类
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/25. 17:09
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductService  productService;

    @Autowired
    private CategoryService  categoryService;

    @GetMapping("/List")
    public ResultVO  list(){
        // 1. 查询所有上架商品
        List<ProductInfo>  productInfoList = productService.findUpAll();
        //2.查询类目（一次性查询）

        // 1.传统方法
        //        List<Integer>  categoryTypeList = new ArrayList<>();
//        for (ProductInfo p :productInfoList) {
//            categoryTypeList.add(p.getCategoryType());
//        }
        // 2.精减  java8  Lambda
        List<Integer>  categoryTypeList =  productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
           // 得到类目列表
         List<ProductCategory>  productCategoryList =  categoryService.findByCategoryTypeIn(categoryTypeList);
        //3.数据封装
        List<ProductVO>  productVOList = new ArrayList<>()  ;
        for (ProductCategory p : productCategoryList) {
            ProductVO  productVO = new ProductVO()  ;
            productVO.setCategoryType(p.getCategoryType());
            productVO.setCategoryName(p.getCategoryName());
            List<ProductInfoVo>   productInfoVos = new ArrayList<>();
            for (ProductInfo productInfo:productInfoList) {
                if (productInfo.getCategoryType().equals(p.getCategoryType())){
                    ProductInfoVo  productInfoVo= new ProductInfoVo();
                    /*拷贝商品详情 到另一个类中spring提供*/
                    BeanUtils.copyProperties(productInfo,productInfoVo);
                    productInfoVos.add(productInfoVo);
                }
            }
            /*将数据加入第三层*/
            productVO.setProductInfoVoList(productInfoVos);
            /*将数据加入第二层*/
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
