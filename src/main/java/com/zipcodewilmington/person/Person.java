package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String address;
    private String number;
    private String eyes;
    private String hair;
    private String gender;

    public Person() {
        name = "";
        age= Integer.MAX_VALUE;
        address="12345 Pink Valley Way";
        number = "1234567890";
        eyes = "yellow";
        hair = "red";
        gender = "female";

    }

    public Person(int age) {
        this.age=age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public Person(String name, int age, String address, String number, String eyes, String hair,String gender){
        this.name=name;
        this.age = age;
        this .address = address;
        this.number= number;
        this.eyes=eyes;
        this.hair=hair;
        this.gender=gender;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
       this.age=age;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public void setNumber(String number) {
        this.number=number;
    }

    public void setEyes(String eyes) {
        this.eyes=eyes;
    }

    public void setHair(String hair) {
        this.hair=hair;
    }
    public void setGender(String gender) {
        this.gender=gender;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public String getNumber() {
        return this.number;
    }

    public String getEyes() {
        return this.eyes;
    }

    public String getHair() {
        return this.hair;
    }
    public String getGender() {
        return this.gender;
    }
}
