package com.cetin;

import com.cetin.email.*;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("101", 99.99);

        boolean result = sendOrderEmailWithoutFacade(order);

        System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));

    }

    private static boolean sendOrderEmailWithoutFacade(Order order) {
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
}
