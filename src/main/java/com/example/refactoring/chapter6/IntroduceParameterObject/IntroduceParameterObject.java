package com.example.refactoring.chapter6.IntroduceParameterObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntroduceParameterObject {

    public static void main(String[] args) {
        Station station = new Station();
        station.name = "ZB1";
        station.reading = Arrays.asList(
                new Range(47, "2020-01"),
                new Range(43, "2020-02"),
                new Range(46, "2020-03"),
                new Range(41, "2020-04")
        );


        OperatingPlan operatingPlan = new OperatingPlan();
        operatingPlan.temperatureCeiling = 46;
        operatingPlan.temperatureFloor = 42;


        NumberRange numberRange = new NumberRange(36,42);
        List<Range> ranges = readingsOutsideRange(station, operatingPlan.temperatureFloor, operatingPlan.temperatureCeiling, numberRange);

        assert ranges.size() == 2;

    }

    public static List<Range> readingsOutsideRange(Station station, int min, int max, NumberRange numberRange){
        return station.reading.stream()
                .filter(s -> s.temp > numberRange.min || s.temp > numberRange.max)
                .collect(Collectors.toList());
    }
}
