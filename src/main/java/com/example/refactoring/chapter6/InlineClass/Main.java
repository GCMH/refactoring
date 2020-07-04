package com.example.refactoring.chapter6.InlineClass;

public class Main {
    public static void main(String[] args) {
        ShippingCompany shippingCompany = new ShippingCompany();


        System.out.println(shippingCompany.getTrackingInformation().display());
    }
}
