package com.example.refactoring.chapter6.DecomposeConditional;

import java.time.Instant;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        LocalDateTime aDate = LocalDateTime.now();
        Plan plan = new Plan();
        int quantity = 0;
        int charge = 0;
        if (!aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd))
            charge = quantity * plan.summerRate;
        else
            charge = quantity * plan.regularRate + plan.regularServiceCharge;
    }
}
