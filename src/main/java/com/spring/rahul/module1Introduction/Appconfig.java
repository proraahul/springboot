package com.spring.rahul.module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {

    @Bean
    //@Scope("prototype")
    public PaymentService paymentService(){
        //more logic
        return new PaymentService();
    }

}
