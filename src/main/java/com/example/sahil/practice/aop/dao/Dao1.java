package com.example.sahil.practice.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething(){
        return this.getClass().getCanonicalName();
    }
}
