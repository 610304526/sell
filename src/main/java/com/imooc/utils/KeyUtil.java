package com.imooc.utils;

import java.util.Random;

/**
 * 生成订单号的方法
 * @version 1.0
 * @Email:610304526@qq.com
 * @Author 缪希灿
 * Created by max on 2018/3/28. 19:23
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     * synchronized  多线程
     */

    public static synchronized String genUniqueKey() {

//        生成随机数
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        // 当前的毫秒数  + 6位随机数
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
