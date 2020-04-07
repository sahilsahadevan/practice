package com.example.sahil.practice.utils;

import org.springframework.util.CollectionUtils;

import java.util.List;

public class CommonUtils {

    private CommonUtils(){
        //private
        }

    public static void test(List<Integer> testList){
        if(CollectionUtils.isEmpty(testList)){
            return;
        }
        Integer randomValue  = Integer.parseInt(""+Math.random() * 10);
        System.out.println("--------------"+randomValue);
    }
}
