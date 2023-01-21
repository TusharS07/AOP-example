package com.example.aop_sample;

import org.aspectj.lang.ProceedingJoinPoint;
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

    @Before("execution(* studying1())")
    public void moringMsg() {
        System.out.println("Good Morning");
    }

    @After("execution(* com.example.aop_sample.controller.AOPController.*())")
    public void welcome() {
        System.out.println("Welcome To StudyRoom");
    }

    @Around("execution(* sum(..))")
    public int around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("sum of number is");
        int x = (int)proceedingJoinPoint.getArgs()[0];
        int y = (int)proceedingJoinPoint.getArgs()[1];
        return x + 10 + y + 5;
    }
}
