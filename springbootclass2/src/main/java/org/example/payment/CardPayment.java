package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cardPay")
public class CardPayment implements Payment {


    public void paymentDone()
    {
        System.out.println("card Payment Done");
    }
}
