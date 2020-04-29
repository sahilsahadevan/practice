package com.example.sahil.practice.aop.business;

import com.example.sahil.practice.aop.config.TrackTime;
import com.example.sahil.practice.aop.dao.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl1 implements BusinessService {

    @Autowired
    public Dao1 dao1;

    @Override
    public String calculateSomething(){
        return dao1.retrieveSomething();
    }
}
