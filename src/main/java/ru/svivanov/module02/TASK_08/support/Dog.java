package ru.svivanov.module02.TASK_08.support;

public class Dog extends Animal {
    public Dog(String name, int age, People owner) {
        super(name, age, owner);
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
