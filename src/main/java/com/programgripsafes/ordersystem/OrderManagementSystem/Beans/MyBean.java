package com.programgripsafes.ordersystem.OrderManagementSystem.Beans;

import com.programgripsafes.ordersystem.OrderManagementSystem.OrderSystem;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.programgripsafes.ordersystem.OrderManagementSystem.OrderSystem.orderNumber;

@Component
public class MyBean {

    @Autowired
    private OrderSystem orderSystem;

    @PostConstruct
    public void init() {

        System.out.println("Hi, the starting ordernumber is (MyBean): " + orderNumber);
        orderNumber = orderSystem.incrementOrderNumber(orderNumber);
        System.out.println("The new ordernumber is (MyBean): " + orderNumber);
    }
}
