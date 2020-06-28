package com.example.refactoring.chapter6.IntroduceParameterObject;

public class NumberRange {

    int max;
    int min;

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public NumberRange(int max, int min) {
        this.max = max;
        this.min = min;
    }
}
