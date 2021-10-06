package com.michael.aop;

import com.michael.aop.dao.UserDao;
import com.michael.aop.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * desc
 *
 * @author wangc 2021-10-06
 * @since 1.0.0
 */
public class JdkProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(3, 7);

        System.out.println(result);
    }
}
class UserDaoProxy implements InvocationHandler {

    Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行...."+method.getName()+" :传递的参 数..."+ Arrays.toString(args));
        Object res = method.invoke(obj, args);
        System.out.println("方法之后执行...."+obj);
        return res;
    }
}