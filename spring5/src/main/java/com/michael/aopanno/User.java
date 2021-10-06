package com.michael.aopanno;

import org.springframework.stereotype.Component;

/**
 * desc
 *
 * @author wangc 2021-10-06
 * @since 1.0.0
 */
@Component
public class User {
    public void add(){
        System.out.println("add..........");
    }
}
