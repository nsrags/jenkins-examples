package com.learning;

import com.learning.services.RiskAssessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
//@ComponentScan
@SpringBootConfiguration(proxyBeanMethods = false)
@Import({TestConfiguration.class})
public class LearningApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class,args);
    }


}
