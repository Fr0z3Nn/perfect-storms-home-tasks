package ru.svivanov.module02.TASK_07;

import ru.svivanov.module02.TASK_07.garages.Garage;
import ru.svivanov.module02.TASK_07.trucks.DAF;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage.enter(new DAF("23x12x2", 12, 4, 213)));
        System.out.println(garage.leave());
        System.out.println(garage.leave());
    }
}
