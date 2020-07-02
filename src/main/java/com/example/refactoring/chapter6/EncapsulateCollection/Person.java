package com.example.refactoring.chapter6.EncapsulateCollection;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Person {
    private String name;
    private List<Course> courses = new ArrayList<>();


    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

}
