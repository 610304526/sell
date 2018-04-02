package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @version 1.0
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/25. 16:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private  ProductServiceImpl productService;
    @Test
    public void findOne() {
       ProductInfo  productInfo= productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo>  productInfoList  =productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest   request = new PageRequest(0,2);
        Page<ProductInfo>  productInfoPage= productService.findAll(request);
//        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
        }

    @Test
    public void save() {
        ProductInfo   productInfo = new ProductInfo();
        productInfo.setProductId("1234567");
        productInfo.setProductName("皮蛋粥1");
        productInfo.setProductPrice( new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo  result=  productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}