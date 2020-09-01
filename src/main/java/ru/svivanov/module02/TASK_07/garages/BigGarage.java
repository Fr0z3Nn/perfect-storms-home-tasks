package ru.svivanov.module02.TASK_07.garages;

import ru.svivanov.module02.TASK_07.Vehicle;

public class BigGarage implements GarageInterface<Vehicle> {
    Vehicle[] vehicles = new Vehicle[2];
    @Override
    public boolean enter(Vehicle vehicle) {
        for(Vehicle cars : vehicles){
            if(cars == null){
                cars = vehicle;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean leave() {
        for(Vehicle cars : vehicles){
            if(cars != null){
                cars = null;
                return true;
            }
        }
        return false;
    }
}
