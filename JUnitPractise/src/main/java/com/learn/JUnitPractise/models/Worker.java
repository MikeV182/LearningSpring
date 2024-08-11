package com.learn.JUnitPractise.models;

import com.learn.JUnitPractise.repositories.Gender;

public class Worker {
    private int salary;
    private Gender gender;
    private int age;
    private String name;

    public Worker(int salary, Gender gender, int age, String name) {
        this.salary = salary;
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public Worker() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
