package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String eyeColor;
    private String hairColor;
    private String lastName;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
