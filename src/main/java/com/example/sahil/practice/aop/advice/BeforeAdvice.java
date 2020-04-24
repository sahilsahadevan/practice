package com.example.sahil.practice.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAdvice {

    private final Logger log = LoggerFactory.getLogger(BeforeAdvice.class);

    //execution(* PACKAGE.*.*(..))
    //first * means wildcard return type, you can also declare a specific return type
    //PACKAGE means the package (com.example.sahil)
    //second * means wildcard Class, you can also declare a specific Class name
    //third * means wildcard method(), you can also declare a specific method
    //(..) mean any argument and any number of arguments, you can also make this specific

    //this annotation is called before a joinpoint is accessed usually to check things
    // like user has permissions etc, or  a new password has the right strength



    @Before("execution(* com.example.sahil.practice.aop.business.*.*(..))")
    public void beforeAllAopBusiness(JoinPoint joinPoint) {
        log.info("----------- [beforeAllAopBusiness] Intercepted method calls BEFORE its execution, joinPoint={}", joinPoint);


    }

    @Before("execution(* com.example.sahil.practice.aop..*.*(..))")
    public void beforeAllAop(JoinPoint joinPoint) {
        log.info("----------- [beforeAllAop] Intercepted method calls BEFORE its execution, joinPoint={}", joinPoint);
    }


}
