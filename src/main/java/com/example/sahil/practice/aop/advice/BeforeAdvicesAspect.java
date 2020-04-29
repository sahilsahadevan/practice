package com.example.sahil.practice.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAdvicesAspect {

    private final Logger log = LoggerFactory.getLogger(BeforeAdvicesAspect.class);

    /*
     * These @Before annotations are called before a joinpoint is accessed usually to check things
     * like user has permissions etc, or  a new password has the right strength
     */

    //We can either write PointCut designator expressions directly or call PointCut signatures from CommonPointCutConfig
    @Before("execution(* com.example.sahil.practice.aop.business.*.*(..))")
    public void beforeAllAopBusiness(JoinPoint joinPoint) {
        log.info("----------- [beforeAllAopBusiness] Intercepted method calls BEFORE its execution, joinPoint={}", joinPoint);


    }

    @Before("execution(* com.example.sahil.practice.aop.business.*.*(..))")
    public void beforeAllAop(JoinPoint joinPoint) {
        log.info("----------- [beforeAllAop] Intercepted method calls BEFORE its execution, joinPoint={}", joinPoint);
    }


}
