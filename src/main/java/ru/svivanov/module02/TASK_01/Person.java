package ru.svivanov.module02.TASK_01;

import java.util.Date;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void meditation(){
        System.out.print("I think - it means I exist. " + "(" + this.name + ")" +" "+ new Date());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
