package org.example.payment;

import org.example.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Payment {

 //   @Autowired
   private  Order order;

   @Autowired
  public  Payment(Order order) {
        this.order = order;
    }

    public void payment() {

        System.out.println("payment Done...");
        order.getOrderDetails();
    }
}
