package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //  B b=new B();
       // b.testB();

        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig .class);
        Order order=ctx.getBean(Order.class);
        order.order();
    }
}