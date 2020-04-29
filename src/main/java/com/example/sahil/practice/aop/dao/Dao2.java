package com.example.sahil.practice.aop.dao;

import com.example.sahil.practice.aop.config.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveSomething(){
        return "Dao2.retrieveSomething() executed";
    }

    public String modifySomething() {
        return "Dao2.modifySomething() executed";
    }
}
