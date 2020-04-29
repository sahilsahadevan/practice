package com.example.sahil.practice.aop.dao;

import com.example.sahil.practice.aop.config.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething(){
        return "Dao1.retrieveSomething() executed";
    }
}
