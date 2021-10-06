package com.michael.aop.dao;

/**
 * desc
 *
 * @author wangc 2021-10-06
 * @since 1.0.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
