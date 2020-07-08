package com.example.refactoring.chapter6.SplitLoop;

public class Main {
    public static final int Infinity = 18;
    public static void main(String[] args) {

        People[] people = new People[5];
        calTotalSalary(people);
        getMinAge(people);
    }

    public static void getMinAge(People[] people) {
        int youngest = people[0] != null ? people[0].age : Infinity;
        for (People p : people) {
            if (p.age < youngest) youngest = p.age;
        }
    }

    public static void calTotalSalary(People[] people) {
        int totalSalary = 0;
        for (People p : people) {
            totalSalary += p.salary;
        }
    }
}
