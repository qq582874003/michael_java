package com.michael.service;

import com.michael.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * desc
 *
 * @author wangc 2021-10-05
 * @since 1.0.0
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void add(){
        System.out.println("service add.....");
        userDao.add();
    }
}
