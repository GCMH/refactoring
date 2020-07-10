package com.example.refactoring.chapter6.ReplaceDerivedVariableWithQuery;

import java.util.List;

public class ProductionPlan {

    int production;

    List<Adjustment> adjustments;

    public int getProduction() {
        return this.production;
    }

    void applyAdjustment(Adjustment anAdjustment) {
        this.adjustments.add(anAdjustment);
        this.production += anAdjustment.amount;
    }
}
