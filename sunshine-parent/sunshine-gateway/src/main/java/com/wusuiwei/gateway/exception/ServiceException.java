package com.wusuiwei.gateway.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SUIWEI WU
 * @date 2021/8/2 19:16
 */
public class ServiceException extends RuntimeException implements BaseException {

    private long code;
    private String message;
    private String exception = "ServiceException";

    public ServiceException(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public ServiceException(BaseExceptionConstants baseExceptionConstants) {
        this.code = baseExceptionConstants.getCode();
        this.message = baseExceptionConstants.getMessage();
    }

    @Override
    public long getErrorCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getException() {
        return this.exception;
    }

    @Override
    public Map<String, Object> getErrorMap() {
        Map<String, Object> map = new HashMap<>(3);
        map.put("code", this.getErrorCode());
        map.put("msg", this.getMessage());
        map.put("exception", this.getException());
        return map;
    }
}
