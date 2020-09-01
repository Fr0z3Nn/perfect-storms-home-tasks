package ru.svivanov.module02.TASK_07.garages;

import ru.svivanov.module02.TASK_07.Car;

public class MiniGarage implements GarageInterface<Car> {
    Car[] cars = new Car[1];
    @Override
    public boolean enter(Car vehicle) {
        if(cars[0] == null){
            cars[0] = vehicle;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean leave() {
        if(cars[0] != null){
            cars[0] = null;
            return true;
        }else{
            return false;
        }
    }
}
