package com.example.sahil.practice.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveSomething(){
        return this.getClass().getCanonicalName();
    }
}
