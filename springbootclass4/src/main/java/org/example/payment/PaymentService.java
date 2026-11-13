package org.example.payment;

import org.example.order.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Scope("prototype")
//@Lazy
//@Scope("singleton")
//@Scope("prototype")
public class PaymentService {

private FoodOrderService foodOrderService;

@   Autowired
    public  PaymentService(FoodOrderService foodOrderService) {
        System.out.println("food order created done..");
        this.foodOrderService = foodOrderService;
    }
/*
   @Autowired
    public  PaymentService() {
        System.out.println("payment  created done..");
    }*/

    public void payment(){
        System.out.println("payment done..");
        foodOrderService.order2();
    }
}
