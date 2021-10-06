package com.michael.aopxml;

import org.springframework.stereotype.Component;

/**
 * desc
 *
 * @author wangc 2021-10-07
 * @since 1.0.0
 */
public class BookProxy {
    public void before(){
        System.out.println("bookProxy before ,,,,,,,,,,,");
    }
}
