package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.example.payment.Payment;
import org.example.payment.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig .class);
        Order order=ctx.getBean(Order.class);
        order.orderDone();

       User user= ctx.getBean(User.class);
       int y=user.getAge();
       System.out.println("..y="+y);
    }
}