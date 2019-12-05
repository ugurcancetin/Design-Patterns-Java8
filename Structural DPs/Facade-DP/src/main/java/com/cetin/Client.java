package com.cetin;

import com.cetin.email.EmailFacade;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("101", 99.99);

        boolean result = new EmailFacade().sendOrderEmail(order);

        System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));

    }

}
