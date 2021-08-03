package com.wusuiwei.gateway.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * 基础异常接口
 *
 * @author SUIWEI WU
 * @date 2021/8/2 19:12
 */
public interface BaseException {
    long getErrorCode();

    String getMessage();

    String getException();

    default Map<String, Object> getErrorMap() {
        Map<String, Object> map = new HashMap<>(3);
        map.put("code", this.getErrorCode());
        map.put("msg", this.getMessage());
        map.put("exception", this.getException());
        return map;
    }
}
