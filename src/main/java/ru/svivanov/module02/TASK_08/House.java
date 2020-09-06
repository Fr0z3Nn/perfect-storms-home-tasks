package ru.svivanov.module02.TASK_08;

import ru.svivanov.module02.TASK_08.support.Animal;
import ru.svivanov.module02.TASK_08.support.People;

public class House {
    double area;
    People[] tenant;
    Animal[] pets;

    public House(double area, People[] tenant, Animal[] pets) {
        this.area = area;
        this.tenant = tenant;
        this.pets = pets;
    }

    public House(double area, Animal[] pets) {
        this.area = area;
        this.pets = pets;
    }

    public House(double area, People[] tenant) {
        this.area = area;
        this.tenant = tenant;
    }

    public House(double area) {
        this.area = area;
    }
}
