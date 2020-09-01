package ru.svivanov.module02.TASK_07;

public abstract class Truck extends Car{
    private int maxWeight;

    public Truck(String size, int power, int maxSpeed, int maxWeight) {
        super(size, power, maxSpeed);
        this.maxWeight = maxWeight;
    }


    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
