package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameAgeAddressNumberEyesHairGender() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedAddress = "12345 Pink Valley Way";
        String expectedNumber = "1234567890";
        String expectedEyes = "yellow";
        String expectedHair = "red";
        String expectedGender = "female";

        // When
        Person person = new Person(expectedName, expectedAge, expectedAddress,expectedNumber,expectedEyes,expectedHair,expectedGender);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualAddress = person.getAddress();
        String actualNumber = person.getNumber();
        String actualEyes = person.getEyes();
        String actualHair = person.getHair();
        String actualGender = person.getGender();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress,actualAddress);
        Assert.assertEquals(expectedNumber,actualNumber);
        Assert.assertEquals(expectedEyes,actualEyes);
        Assert.assertEquals(expectedHair,actualHair);
        Assert.assertEquals(expectedGender,actualGender);
    }



    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress() {
        // Given
        Person person = new Person();
        String expected = "12345 Pink Valley Way";

        // When
        person.setAddress(expected);
        String actual = person.getAddress();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetNumber() {
        // Given
        Person person = new Person();
        String expected = "1234567890";

        // When
        person.setNumber(expected);
        String actual = person.getNumber();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyes() {
        // Given
        Person person = new Person();
        String expected = "yellow";

        // When
        person.setEyes(expected);
        String actual = person.getEyes();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHair() {
        // Given
        Person person = new Person();
        String expected = "red";

        // When
        person.setHair(expected);
        String actual = person.getHair();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "Female";

        // When
        person.setGender(expected);
        String actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
