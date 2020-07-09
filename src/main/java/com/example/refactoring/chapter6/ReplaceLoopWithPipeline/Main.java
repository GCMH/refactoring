package com.example.refactoring.chapter6.ReplaceLoopWithPipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String csv = "------title--------\n" +
                "office, country, telephone\n" +
                "Chicago, USA, +1 312 373 1000\n" +
                "Beijing, China, +86 4008 900 505\n" +
                "Bangalore, India, +91 80 4064 9570\n" +
                "Porto Alegre, Brazil, +55 51 3079 3550\n" +
                "Chennai, India, +91 44 660 44766";

        System.out.println(acquireData(csv));
    }

    static List<String> acquireData(String input) {
        String[] lines = input.split("\n");
        return Arrays.stream(lines)
                .skip(1)
                .filter(line -> !line.trim().equals(""))
                .map(line -> line.split(","))
                .filter(t -> t[1].trim().equals("India"))
                .map(record -> "city:" + record[0].trim() + " " + "phone:" + record[2].trim() + "\n")
                .collect(Collectors.toList());
    }
}
