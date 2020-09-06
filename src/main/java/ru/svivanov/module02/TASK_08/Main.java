package ru.svivanov.module02.TASK_08;

import ru.svivanov.module02.TASK_08.support.Engine;
import ru.svivanov.module02.TASK_08.support.People;

public class Main {
    //car example
    //you can get car with or without passengers
    Car car = new Car(new Engine(300),"blue");
    Car car1 = new Car(new Engine(300),new People[]{new People("Bob",10,"brown")},"blue");
}
