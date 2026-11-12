package org.example;


import org.example.payment.CardPayment;
import org.example.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.example.payment.Payment;

@Component
public class Order {

   @Autowired
    @Qualifier("cardPay")
    Payment payment;

   /* @Autowired
    public Order(@Qualifier("cashPay")Payment payment) {

        this.payment = payment;
    }*/


    /*
    @Autowired
    public Payment setPayment(@Qualifier("cashPay")Payment payment) {

        this.payment = payment;
        return payment;
    }*/


    public void orderDone()
    {
        this.payment.paymentDone();
        System.out.print("Order Done");
    }


}
