package com.example.sahil.practice.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAdvicesAspect {

    private final Logger log = LoggerFactory.getLogger(AfterAdvicesAspect.class);

    /*
     * These @After annotations are called After a joinpoint is accessed usually to check validity of a result,
     * handle exceptions etc.
     */

    @After("com.example.sahil.practice.aop.config.CommonPointCutConfig.businessLayerExecutionPointCutConfig()")
    public void afterAllAopBusiness(JoinPoint joinPoint) {
        log.info("++++++++++++ [afterAllAopBusiness] Intercepted the point just AFTER method execution, joinPoint={}", joinPoint);
    }

    @AfterReturning(value = "com.example.sahil.practice.aop.config.CommonPointCutConfig.businessLayerExecutionPointCutConfig()", returning = "result")
    public void afterAllAopBusinessReturning(JoinPoint joinPoint, Object result) {
        log.info("++++++++++++ [afterAllAopBusinessReturning] Intercepted the point just AFTER method execution returned a successful response," +
                " joinPoint={}, result={}", joinPoint, result);
    }

    @After("com.example.sahil.practice.aop.config.CommonPointCutConfig.daoLayerExecutionPointCut()")
    public void afterAllAopDao(JoinPoint joinPoint) {
        log.info("++++++++++++ [afterAllAopDao] Intercepted the point just AFTER method execution, joinPoint={}", joinPoint);
    }

    @AfterReturning(value = "com.example.sahil.practice.aop.config.CommonPointCutConfig.daoLayerExecutionPointCut()", returning = "result")
    public void afterAllAopDaoReturning(JoinPoint joinPoint, Object result) {
        log.info("++++++++++++ [afterAllAopDaoReturning] Intercepted the point just AFTER method execution returned a successful response," +
                " joinPoint={}, result={}", joinPoint, result);
    }

    @AfterThrowing(value = "com.example.sahil.practice.aop.config.CommonPointCutConfig.businessLayerExecutionPointCutConfig()", throwing = "exception")
    public void afterAllAopBusinessThrowing(JoinPoint joinPoint, Object exception) {
        log.info("++++++++++++ [afterAllAopBusinessThrowing]  Intercepted the point just AFTER method execution returned exception," +
                " joinPoint={}, exception={}", joinPoint, exception);
    }
}
