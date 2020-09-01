package ru.svivanov.module02.TASK_07.garages;

import ru.svivanov.module02.TASK_07.Vehicle;

public interface GarageInterface<T extends Vehicle> {
    boolean enter(T vehicle);
    boolean leave();
}
