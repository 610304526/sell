package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/25. 17:52
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private  String  categoryName;

    @JsonProperty("type")
    private Integer  categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo>  productInfoVoList;
}
