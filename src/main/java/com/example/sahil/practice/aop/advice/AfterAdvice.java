package com.example.sahil.practice.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAdvice {

    private final Logger log = LoggerFactory.getLogger(AfterAdvice.class);

    //execution(* PACKAGE.*.*(..))
    //first * means wildcard return type, you can also declare a specific return type
    //PACKAGE means the package (com.example.sahil)
    //second * means wildcard Class, you can also declare a specific Class name
    //third * means wildcard method(), you can also declare a specific method
    //(..) mean any argument and any number of arguments, you can also make this specific

    //this annotation is called before a joinpoint is accessed usually to check things
    // like user has permissions etc, or  a new password has the right strength

    @After("execution(* com.example.sahil.practice.aop.business.*.*(..))")
    public void afterAllAopBusiness(JoinPoint joinPoint) {
        log.info("++++++++++++ [afterAllAopBusiness] Intercepted method calls AFTER its execution, joinPoint={}", joinPoint);
    }

    @AfterReturning(value = "execution(* com.example.sahil.practice.aop.business.*.*(..))", returning = "result")
    public void afterAllAopBusinessReturning(JoinPoint joinPoint, Object result) {
        log.info("++++++++++++ [afterAllAopBusinessReturning] Intercepted method calls AFTER its execution, " +
                "joinPoint={}, execution={}", joinPoint);
    }

    @AfterThrowing(value = "execution(* com.example.sahil.practice.aop.business.*.*(..))", throwing = "exception")
    public void afterAllAopBusinessThrowing(JoinPoint joinPoint,  Object exception) {
        log.info("++++++++++++ [afterAllAopBusinessThrowing] Intercepted method calls AFTER its execution, joinPoint={}", joinPoint);
    }
}
