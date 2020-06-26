package com.example.refactoring.chapter6.extractfunction;

import java.time.LocalDate;

public class ExtractFunction {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.customer = "hcf";
        invoice.orders = new Order[]{new Order(0)};
        System.out.println(printOwing(invoice));

        invoice.customer = "sss";
        invoice.orders = new Order[]{new Order(5), new Order(10)};
        System.out.println(printOwing(invoice));
    }
    public static String printOwing(Invoice invoice){
        StringBuffer result = new StringBuffer();
        int outstanding = 0;
        result.append("*******************\n");
        result.append("***Customer Owes***\n");
        result.append("*******************\n");

        //calculate outstanding
        for(Order o: invoice.orders){
            outstanding += o.amount;
        }

        LocalDate today = LocalDate.now();
        invoice.dueDate = today.plusDays(30);

        //print details
        result.append("name:" + invoice.customer + "\n");
        result.append("amount:" + outstanding + "\n");
        result.append("due:" + invoice.dueDate.toString() + "\n");

        return result.toString();
    }
}
