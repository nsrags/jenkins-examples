package com.learning;

import com.learning.services.AccountServiceImpl;
import com.learning.services.RiskAssessor;
import com.learning.web.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public TestController testController(){
        return new TestController(new AccountServiceImpl(new RiskAssessor()));
    }

    @Bean
    public AccountServiceImpl accountService(){
        return new AccountServiceImpl(riskAssessor());
    }

    @Bean
    public RiskAssessor riskAssessor(){
        return new RiskAssessor();
    }
}
