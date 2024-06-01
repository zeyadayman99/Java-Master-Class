package com.zeyadayman.WorkingWithObjects;

public class ClassesAndObjects {
    private String name;
    private int age;

    //default Constructor
    public ClassesAndObjects(){}
    public ClassesAndObjects(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
