package com.example.aop_sample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@EnableAspectJAutoProxy
@Component
@Aspect
public class UserAspect {

    @Before("execution(* com.example.aop_sample.*.*.*(..))")
    public void moringMsg() {
        System.out.println("Good Morning");
    }

    @After("execution(* com.example.aop_sample.controller.AOPController.*())")
    public void welcome() {
        System.out.println("Welcome To StudyRoom");
    }

//    @Around("execution(* com.example.aop_sample.controller.AOPController.*())")
//    public void around() {
//        System.out.println("i am enjoying");
//    }


}
