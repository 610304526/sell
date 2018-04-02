package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 缪希灿
 * Created by max on 2018/3/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
        @Autowired
        private   ProductCategoryRepository productCategoryRepository;

        @Test
        public   void   findOneTest(){
            List<Integer>  list= new ArrayList<>();
            list.add(1);
             List<ProductCategory> productCategoryList =  productCategoryRepository.findAll(list);
            for (ProductCategory productCategory:productCategoryList) {

                System.out.println( productCategory.toString());
            }
        }

        @Test
        @Transactional
        public  void  saveTest(){
//            ProductCategory productCategory =new ProductCategory();
//            productCategory.setCategoryId(2);
//            productCategory.setCategoryName("女生最爱");
//            productCategory.setCategoryType(3);
//            productCategoryRepository.save(productCategory);

            ProductCategory productCategory =new ProductCategory("男生最爱",4);
            ProductCategory result=productCategoryRepository.save(productCategory);
            Assert.assertNotEquals(null,result);
        }
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}