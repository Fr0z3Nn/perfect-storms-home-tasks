package ru.svivanov.module02.TASK_11;

public class Person {

    private String name;
    private int age;
    private String company;

    public void setName(String name) {
        this.name = name;
    }

    //setter for the age field must be absent


    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    //getter for the name field must be absent


    public String getCompany() {
        return company;
    }
}