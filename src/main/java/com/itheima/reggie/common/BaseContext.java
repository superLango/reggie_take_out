package com.itheima.reggie.common;

/**
 * @author Lango
 * @version 1.0
 * 基于 ThreadLocal 封装工具类，用于保存和获取当前登录用户的Id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 保存当前登录用户id
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 得到当前登录用户id
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
