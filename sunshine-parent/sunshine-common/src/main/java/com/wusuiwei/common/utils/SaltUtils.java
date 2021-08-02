package com.wusuiwei.common.utils;

import java.util.Random;

/**
 * 随机盐生成工具类
 *
 * @author SUIWEI WU
 * @date 2021/7/24 16:57
 */
public class SaltUtils {
    /**
     * 获取生成的盐
     *
     * @param saltlength 盐的长度
     * @return
     */
    public static String getSalt(int saltlength) {
        char[] chars = "bakfbaowbfjkabofbaCCUVUIVIWDKV%$&^%*&*%$1131415".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < saltlength; i++) {
            char ch = chars[new Random().nextInt(chars.length)];
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
