package com.imooc.form;

import lombok.Data;

/**
 * Created by 缪希灿
 *
 * @Email : 610304526@qq.com
 * 2018/3/29   15:01
 */
@Data
public class Category {
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
