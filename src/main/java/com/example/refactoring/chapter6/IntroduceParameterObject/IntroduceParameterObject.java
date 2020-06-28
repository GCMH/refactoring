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
        operatingPlan.temperatureCeiling = 45;
        operatingPlan.temperatureFloor = 42;

        readingsOutsideRange(station, operatingPlan.temperatureFloor, operatingPlan.temperatureCeiling);

    }

    public static List<Range> readingsOutsideRange(Station station, int min, int max){
        return station.reading.stream()
                .filter(s -> s.temp > min || s.temp > max)
                .collect(Collectors.toList());
    }
}
