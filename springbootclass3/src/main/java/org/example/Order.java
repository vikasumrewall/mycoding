package org.example;

import org.example.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

 /*
@Autowired
private Payment payment;*/
 private Payment payment;

@Autowired
public Order(Payment payment)
{
    this.payment=payment;
}

public  void order()
{
    payment.payment();
    System.out.println("order is Done...");

}


public  void getOrderDetails()
{
    System.out.println("get order details is Done...");
}

}
