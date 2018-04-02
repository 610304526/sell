package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * 自定义异常
 * @version 1.0
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/28. 19:07
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
