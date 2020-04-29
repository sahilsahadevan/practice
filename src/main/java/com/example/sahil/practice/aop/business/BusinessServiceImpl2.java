package com.example.sahil.practice.aop.business;

import com.example.sahil.practice.aop.config.TrackTime;
import com.example.sahil.practice.aop.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl2 implements BusinessService {

    @Autowired
    public Dao2 dao2;

    @Override
    public String calculateSomething(){
        return dao2.retrieveSomething();
    }
}
