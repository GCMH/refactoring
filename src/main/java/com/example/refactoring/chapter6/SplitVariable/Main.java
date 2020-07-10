package com.example.refactoring.chapter6.SplitVariable;

public class Main {
    public static void main(String[] args) {

        Scenario scenario = new Scenario();
        scenario.delay = 0.01;
        scenario.mass = 0.02;
        scenario.primaryForce = 3.1;
        scenario.secondaryForce = 3.4;

        assert distanceTravelled(scenario, 0.3) == distanceTravelled(scenario, 0.3);


    }


    static double distanceTravelled (Scenario scenario, double time) {
        double result;


        final double primaryAcceleration = scenario.primaryForce / scenario.mass;
        double primaryTime = Math.min(time, scenario.delay);
        result = 0.5 * primaryAcceleration * primaryTime * primaryTime;
        double secondaryTime = time - scenario.delay;
        if (secondaryTime > 0) {
            double primaryVelocity = primaryAcceleration * scenario.delay;
            final double secondaryAcceleration = (scenario.primaryForce + scenario.secondaryForce) / scenario.mass;
            result += primaryVelocity * secondaryTime + 0.5 * secondaryAcceleration * secondaryTime * secondaryTime;
        }
        return result;
    }


    static double distanceTravelledTest (Scenario scenario, double time) {
        double result;
        double acc = scenario.primaryForce / scenario.mass;
        double primaryTime = Math.min(time, scenario.delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        double secondaryTime = time - scenario.delay;
        if (secondaryTime > 0) {
            double primaryVelocity = acc * scenario.delay;
            acc = (scenario.primaryForce + scenario.secondaryForce) / scenario.mass;
            result += primaryVelocity * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}
