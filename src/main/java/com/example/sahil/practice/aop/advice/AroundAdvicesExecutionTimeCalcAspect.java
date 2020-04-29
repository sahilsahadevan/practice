package com.example.sahil.practice.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Aspect
@Configuration
public class AroundAdvicesExecutionTimeCalcAspect {

    private final Logger log = LoggerFactory.getLogger(AroundAdvicesExecutionTimeCalcAspect.class);

    /*
     * These @Around annotations are called Before and After a joinpoint is accessed usually to check things
     * adding performance or milestone monitoring logic etc.
     */

    @Around("com.example.sahil.practice.aop.config.CommonPointCutConfig.trackTime()")
    public void aroundAllAopBusiness(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        log.info("============ [aroundAllAopBusiness] Intercepting at the Start of method execution, joinPoint={}", proceedingJoinPoint);
        proceedingJoinPoint.proceed();
        log.info("============ [aroundAllAopBusiness] Intercepting at the End of method execution, " +
                "joinPoint={}", proceedingJoinPoint.getArgs() != null ? Arrays.toString(proceedingJoinPoint.getArgs()) : proceedingJoinPoint);
        long executionTime = System.currentTimeMillis() - startTime;
        log.info("============ Time take to run {} was {} milliseconds", proceedingJoinPoint, executionTime);

    }

}
