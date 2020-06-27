package com.example.refactoring.chapter6.lnlinevariable;


public class lnlineVariable {
    public static void main(String[] args) {

        Order order = new Order();
        order.basePrice = 900;
        System.out.println(check(order));

        order.basePrice = 1100;
        System.out.println(check(order));
    }

    public static boolean check(Order order){
        int price = order.basePrice;
        return price > 1000;
    }
}
