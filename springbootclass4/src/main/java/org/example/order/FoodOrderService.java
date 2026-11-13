package org.example.order;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Scope("singleton")
//@Lazy
//@Scope("prototype")
public class FoodOrderService {
    PaymentService paymentService;


    @Autowired
    public FoodOrderService( PaymentService paymentService){
        System.out.println("FoodOrderService created***");
        this.paymentService = paymentService;
    }


/*
    @Autowired
    public FoodOrderService( PaymentService paymentService){
        System.out.println("FoodOrderService created***");
        this.paymentService = paymentService;
    }*/

    public FoodOrderService(){
        System.out.println("FoodOrderService created.....");
    }
    public void order(){
        paymentService.payment();
        System.out.println("order done.");
    }

    public void order2(){
        System.out.println("order2 done.");
    }

}
