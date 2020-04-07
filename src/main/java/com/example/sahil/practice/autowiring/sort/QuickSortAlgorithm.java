package com.example.sahil.practice.autowiring.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{

    @Override
    public void doSort(){
        //QuickSort implementation logic
    }
}
