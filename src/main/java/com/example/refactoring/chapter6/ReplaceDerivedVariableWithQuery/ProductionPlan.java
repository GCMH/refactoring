package com.example.refactoring.chapter6.ReplaceDerivedVariableWithQuery;

import java.math.BigDecimal;
import java.util.List;

public class ProductionPlan {

    int production;

    List<Adjustment> adjustments;

    public double getProduction() {
        return this.calculatedProduction();
    }

    void applyAdjustment(Adjustment anAdjustment) {
        this.adjustments.add(anAdjustment);
    }

    double calculatedProduction(){
        return this.adjustments.stream()
                .map(arg->new BigDecimal(arg.amount))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }
}
