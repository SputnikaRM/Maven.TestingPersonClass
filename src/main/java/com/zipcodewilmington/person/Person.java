package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        name = "";
        age= Integer.MAX_VALUE;

    }

    public Person(int age) {
        age = getAge();
    }

    public Person(String name) {
        name=this.getName();
    }

    public Person(String name, int age) {
        name = getName();
        age= getAge();
    }

    public void setName(String name) {
        name = getName();
    }

    public void setAge(int age) {
        getAge();
    }

    public String getName() {
        return "Leon";
    }

    public Integer getAge() {
        return 5;
    }
}
