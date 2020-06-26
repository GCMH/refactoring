package com.example.refactoring.chapter6.lnlinefunction;

public class Inlinefunction {
    public static void main(String[] args) {
        Driver adriver = new Driver();
        adriver.numberOfLateDeliveries = 6;
        System.out.println(rating(adriver));
    }

    public static int rating(Driver aDriver) {
        return aDriver.numberOfLateDeliveries > 5 ? 2 : 1;
    }


}
