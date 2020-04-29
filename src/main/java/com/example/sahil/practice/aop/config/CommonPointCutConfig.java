package com.example.sahil.practice.aop.config;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

    //execution(* PACKAGE.*.*(..))
    //first * means wildcard return type, you can also declare a specific return type
    //PACKAGE means the package (com.example.sahil)
    //second * means wildcard Class, you can also declare a specific Class name
    //third * means wildcard method(), you can also declare a specific method
    //(..) mean any argument and any number of arguments, you can also make this specific


    @Pointcut("execution(* com.example.sahil.practice.aop.business.*.*(..))")
    public void businessLayerExecutionPointCutConfig(){}

    @Pointcut("execution(* com.example.sahil.practice.aop.dao.*.*(..))")
    public void daoLayerExecutionPointCut(){}

    @Pointcut("com.example.sahil.practice.aop.config.CommonPointCutConfig.businessLayerExecutionPointCutConfig() && com.example.sahil.practice.aop.config.CommonPointCutConfig.daoLayerExecutionPointCut()")
    public void allLAyerExecutionPointCut(){}

    @Pointcut("bean(*businessService*)")
    public void allBeansContainingBusinessServiceName(){}

    @Pointcut("within(com.example.sahil.practice.sahil.practice.aop.business..*)")
    public void allMethodsWithinBusiness(){}

    @Pointcut("@annotation(com.example.sahil.practice.aop.config.TrackTime)")
    public void trackTime(){}
}
