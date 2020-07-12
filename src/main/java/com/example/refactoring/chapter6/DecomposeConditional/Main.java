package com.example.refactoring.chapter6.DecomposeConditional;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        LocalDateTime aDate = LocalDateTime.now();
        Plan plan = new Plan();
        int quantity = 0;
        int charge = 0;

        charge = isSummer(aDate, plan) ? summerCharge(plan, quantity) : regularCharge(plan, quantity);

        System.out.println(charge);
    }

    public static int regularCharge(Plan plan, int quantity) {
        return quantity * plan.regularRate + plan.regularServiceCharge;
    }

    public static int summerCharge(Plan plan, int quantity) {
        int charge;
        charge = quantity * plan.summerRate;
        return charge;
    }

    public static boolean isSummer(LocalDateTime aDate, Plan plan) {
        return !aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd);
    }
}
