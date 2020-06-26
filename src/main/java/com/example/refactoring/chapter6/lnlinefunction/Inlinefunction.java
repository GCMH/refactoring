package com.example.refactoring.chapter6.lnlinefunction;

public class Inlinefunction {
    public static void main(String[] args) {
        Driver adriver = new Driver();
        adriver.numberOfLateDeliveries = 6;
        System.out.println(rating(adriver));
    }

    public static int rating(Driver aDriver) {
        return moreThanFiveLateDeliveries(aDriver) ? 2 : 1;
    }

    public static boolean moreThanFiveLateDeliveries(Driver aDriver) {
        return aDriver.numberOfLateDeliveries > 5;
    }

}
