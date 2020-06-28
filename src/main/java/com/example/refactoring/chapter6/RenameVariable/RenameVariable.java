package com.example.refactoring.chapter6.RenameVariable;

public class RenameVariable {
    static String tpHd = "untitled";

    public static void main(String[] args) {

        System.out.println(title());
    }

    public void setTitle(String title){
        this.tpHd = title;
    }

    public static String title(){
        return tpHd;
    }
}
