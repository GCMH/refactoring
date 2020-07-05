package com.example.refactoring.chapter6.RemoveMiddleMan;

public class Person {

    String name;

    Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getManager(){
        return this.department.manager;
    }

}
