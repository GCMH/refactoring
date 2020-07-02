package com.example.refactoring.chapter6.EncapsulateCollection;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    String name;
    List<Course> courses;

}
