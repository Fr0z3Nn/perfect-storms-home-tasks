package ru.svivanov.module02.TASK_07;

public abstract class Car extends Vehicle{
    private int maxSpeed;

    public Car(String size, int power, int maxSpeed) {
        super(size, power);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
