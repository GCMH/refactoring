package com.example.refactoring.chapter6.SplitLoop;

public class Main {
    public static final int Infinity = 18;
    public static void main(String[] args) {

        People[] people = new People[5];


        int totalSalary = 0;
        for (People p : people) {
            totalSalary += p.salary;
        }

        int youngest = people[0] != null ? people[0].age : Infinity;
        for (People p : people) {
            if (p.age < youngest) youngest = p.age;
        }
    }
}
