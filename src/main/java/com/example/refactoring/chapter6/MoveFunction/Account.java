package com.example.refactoring.chapter6.MoveFunction;

public class Account {

    private double daysOverdrawn;
    private int _daysOverdrawn;
    private double overdraftCharge;
    private AccountType type;

    double getBankCharge() {
        double result = 4.5;
        if (this._daysOverdrawn > 0) result += this.overdraftCharge;
        return result;
    }

    double getOverdraftCharge() {
        if (this.type.isPremium) {
            int baseCharge = 10;
            if (this.daysOverdrawn <= 7)
                return baseCharge;
            else
                return baseCharge + (this.daysOverdrawn - 7) * 0.85;
        } else {
            return this.daysOverdrawn * 1.75;
        }

    }

    double overdraftCharge(){
        return this.type.overdraftCharge(this.daysOverdrawn);
    }
}
