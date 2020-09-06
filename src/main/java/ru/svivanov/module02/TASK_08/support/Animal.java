package ru.svivanov.module02.TASK_08.support;

public abstract class Animal {
    String name;
    int age;
    // animal can be without owner
    People owner;

    public Animal(String name, int age, People owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
