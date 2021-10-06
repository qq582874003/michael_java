package com.michael.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 增强的类
 *
 * @author wangc 2021-10-06
 * @since 1.0.0
 */
@Component
@Aspect //生成代理对象
public class UserProxy {

    /**
     * 切入点
     */
    @Pointcut(value = "execution(* com.michael.aopanno.User.add(..))")
    public void point(){

    }
    /**
     * 前置通知
     */
    @Before(value = "point()")
    public void before(){
        System.out.println("before................");
    }

    /**
     * 后置通知(返回通知)
     */
    @AfterReturning(value = "execution(* com.michael.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning................");
    }

    /**
     * 最终通知
     */
    @After(value = "execution(* com.michael.aopanno.User.add(..))")
    public void after(){
        System.out.println("after................");
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "execution(* com.michael.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing................");
    }

    @Around(value = "execution(* com.michael.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕之前.........");
        point.proceed();
        System.out.println("环绕之后.........");
    }
}
