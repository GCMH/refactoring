package com.example.refactoring.chapter6.ChangeFunctionDeclaratio;

public class ChangeFunctionDeclaratio {


    public static void main(String[] args) {
        System.out.println(circumference(2.3f));
    }

    public static double circumference(double r){
        return circum(r);
    }

    public static double circum(double r){
        return  2 * Math.PI * r;
    }


}
