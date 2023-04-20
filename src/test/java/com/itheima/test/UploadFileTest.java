package com.itheima.test;

import org.junit.jupiter.api.Test;

/**
 * @author Lango
 * @version 1.0
 */
public class UploadFileTest {
    @Test
    public void test1(){
        String fileName = "eeecc.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
