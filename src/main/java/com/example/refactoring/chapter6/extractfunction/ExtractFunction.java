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

        pringBanner(result);
        int outstanding = getOutstanding(invoice);
        getDueDate(invoice);
        printDetails(invoice, result, outstanding);
        return result.toString();
    }

    public static void getDueDate(Invoice invoice) {
        LocalDate today = LocalDate.now();
        invoice.dueDate = today.plusDays(30);
    }

    public static int getOutstanding(Invoice invoice) {
        int outstanding = 0;
        for(Order o: invoice.orders){
            outstanding += o.amount;
        }
        return outstanding;
    }

    public static void printDetails(Invoice invoice, StringBuffer result, int outstanding) {
        result.append("name:" + invoice.customer + "\n");
        result.append("amount:" + outstanding + "\n");
        result.append("due:" + invoice.dueDate.toString() + "\n");
    }

    public static void pringBanner(StringBuffer result) {
        result.append("*******************\n");
        result.append("***Customer Owes***\n");
        result.append("*******************\n");
    }
}
