package com.jmockit.example;

/**
 * Author sumitk
 * Date   3/29/15
 */
public class Person {

    private String name;


    public Person(){
        name = "Default Abhi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}