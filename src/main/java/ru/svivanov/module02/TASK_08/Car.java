package ru.svivanov.module02.TASK_08;

import ru.svivanov.module02.TASK_08.support.Engine;
import ru.svivanov.module02.TASK_08.support.People;

public class Car {
    Engine engine;
    People[] passengers;
    String color;

    public Car(Engine engine, People[] passengers, String color) {
        this.engine = engine;
        this.passengers = passengers;
        this.color = color;
    }

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }
}
