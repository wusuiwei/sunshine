package com.wusuiwei.common.utils;

/**
 * @author SUIWEI WU
 * @date 2021/8/2 16:21
 */
public class Result<T> {
    private boolean success;
    private int code;
    private String msg;
    private T data;

    public Result(boolean success, int code) {
        this.success = success;
    }

    public Result(T data) {
        this.success = success;
        this.code = 200;
        this.data = data;
    }

}
