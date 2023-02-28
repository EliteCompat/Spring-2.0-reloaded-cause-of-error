package com.programgripsafes.ordersystem.OrderManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderManagementSystemApplication {

	@Autowired
	private static OrderSystem orderSystem;
	private static int orderNumberMain;


	public static void main(String[] args) {
		SpringApplication.run(OrderManagementSystemApplication.class, args);

		System.out.println("HI @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Pn pls (Main)");
		//System.out.println("Hi, the starting order number is (Main): " + orderNumberMain);

		//orderNumberMain = orderSystem.orderNumber;

		System.out.println("Hi, your order number is (Main): " + orderSystem.orderNumber);

	}

}
