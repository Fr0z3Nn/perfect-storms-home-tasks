package ru.svivanov.module02.TASK_07.garages;

import ru.svivanov.module02.TASK_07.Truck;

public class Garage implements GarageInterface<Truck>{
    Truck[] trucksOrCars = new Truck[1];
    @Override
    public boolean enter(Truck vehicle) {
        if(trucksOrCars[0] == null){
            trucksOrCars[0] = vehicle;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean leave() {
        if(trucksOrCars[0] != null){
            trucksOrCars[0] = null;
            return true;
        }else{
            return false;
        }
    }
}
