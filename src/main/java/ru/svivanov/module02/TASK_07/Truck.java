package ru.svivanov.module02.TASK_07;

public abstract class Truck extends Vehicle{
    private int maxWeight;

    public Truck(String size, int power, int maxWeight) {
        super(size, power);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
