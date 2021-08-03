package com.wusuiwei.gateway.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

/**
 * @author SUIWEI WU
 * @date 2021/8/2 19:23
 */
@RestControllerAdvice
public class GloableExceptionHandler {
    /**
     * 业务异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
    public Map exceptionHandler(ServiceException e) {
        System.out.println(e.getErrorMap());
        return e.getErrorMap();
    }
}
