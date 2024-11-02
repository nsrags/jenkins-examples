package com.learning.services;

import org.springframework.context.annotation.Bean;


public class RiskAssessor {
    public void calculateRisk(String accountNbr,String emailAddress){
        System.out.println("Risk is Calculated");
    }
}
