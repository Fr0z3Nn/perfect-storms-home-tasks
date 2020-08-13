package ru.svivanov.module02.TASK_01;

public class Cat {
    String name;
    int age;
    Breed breed;
    Person owner;

    public Cat(String name, int age, Breed breed, Person owner) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                ", owner=" + owner +
                '}';
    }
}
