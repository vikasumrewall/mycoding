package org.example;

import org.example.order.FoodOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig .class);

     FoodOrderService order=ctx.getBean(FoodOrderService.class);

       FoodOrderService order2=ctx.getBean(FoodOrderService.class);
        order.order();

      // FoodOrderService  order3=new FoodOrderService();


       //System.out.println("check=="+(order==order3));

    }
}