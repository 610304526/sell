package com.imooc.vo;

import lombok.Data;

/**
 * http  请求的最外层对象
 * @version 1.0
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/25. 17:15
 */
@Data
public class ResultVO <T>{
    /**
     * 错误码
     */
    private  Integer  code;

    /**
     * 提示信息
     */
    private  String   msg;
    /**
     * 返回的具体内容
     */
    private   T  data;
}
