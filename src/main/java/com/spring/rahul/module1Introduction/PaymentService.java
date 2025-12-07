package com.spring.rahul.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
     public void pay(){
        System.out.println("Payment done successfully");
     }

     @PostConstruct
    public void afterInit(){
        System.out.println("PaymentService Bean is created");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("PaymentService Bean is about to be destroyed");
    }

}
