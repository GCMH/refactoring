package com.example.refactoring.chapter6.ReplaceLoopWithPipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        boolean firstLine = true;
        List<String> result = new ArrayList<>();

        for (String line : lines) {
            if (firstLine) {
                firstLine = false;
                continue;
            }
            if (line.trim().equals(""))
                continue;
            String[] record = line.split(",");
            if (record[1].trim().equals("India")) {
                result.add("city:" + record[0].trim() +" " + "phone:" + record[2].trim() + "\n");
            }
        }
        return result;
    }
}
