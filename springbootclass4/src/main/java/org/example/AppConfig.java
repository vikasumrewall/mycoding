package org.example;


import org.example.order.FoodOrderService;
import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

/*
    @Bean
    public PaymentService createPayment ()
    {
    return new PaymentService();

    }
    @Bean
    public PaymentService cratnewd()
    {

    return new PaymentService();
    }
    */




}
