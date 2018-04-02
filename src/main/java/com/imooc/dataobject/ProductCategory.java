package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 *<p>Title: ContentServiceImpl</p>
 *<p>Description: 类目</p>
 * @version 1.0
 *@Author  缪希灿
 *@Email:610304526@qq.com
 *@Date  2018/3/25  3:52
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /** 类目id.主键    自增   */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
    /**
     * 创建时间
     */
    private Date  createTime;

    /**
     * 更新时间
     */
    private Date  updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
