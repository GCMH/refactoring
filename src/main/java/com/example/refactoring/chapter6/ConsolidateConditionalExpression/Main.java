package com.example.refactoring.chapter6.ConsolidateConditionalExpression;

public class Main {
    public static void main(String[] args) {

    }


    public static int disabilityAmount(Employee anEmployee){
        if (anEmployee.seniority < 2) return 0;
        if (anEmployee.monthsDisabled > 12) return 0;
        if (anEmployee.isPartTime) return 0;
        return -1;
    }
}
