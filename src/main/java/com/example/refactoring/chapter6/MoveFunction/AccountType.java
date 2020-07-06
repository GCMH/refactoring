package com.example.refactoring.chapter6.MoveFunction;

public class AccountType {

    public boolean isPremium;


    double overdraftCharge(double daysOverdrawn) {
        if (this.isPremium) {
            int baseCharge = 10;
            if (daysOverdrawn <= 7)
                return baseCharge;
            else
                return baseCharge + (daysOverdrawn - 7) * 0.85;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

}
