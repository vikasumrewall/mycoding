package org.example;

public class Order {

    Payment payment;

   public Order(Payment payment) {
        this.payment = payment;
    }
    public void orderDone()
    {
        this.payment.paymentDone();
        System.out.print("Order Done");
    }


}
