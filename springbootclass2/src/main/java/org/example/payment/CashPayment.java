package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("cashPay")
public class CashPayment implements Payment {


    public void paymentDone()
    {
        System.out.println("cash Payment Done");
    }
}
