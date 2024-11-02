package com.learning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class AccountServiceImpl implements IAccountService {

    private final RiskAssessor riskAssessor;
    private final PrintStream out;

    @Autowired
    public AccountServiceImpl(RiskAssessor riskAssessor){
        this.riskAssessor = riskAssessor;
        this.out = System.out;
    }

    public AccountServiceImpl(RiskAssessor riskAssessor, PrintStream out){
        this.riskAssessor = riskAssessor;
        this.out = out ;
    }

    @Override
    public void createAccount(String userName, String accountNumber) {
        riskAssessor.calculateRisk(accountNumber,userName);

    }
}
