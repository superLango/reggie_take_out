package com.itheima.reggie.common;

/**
 * @author Lango
 * @version 1.0
 * 自定义业务异常
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
