package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * Created by 缪希灿
 * 2018/3/28   23:23
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
