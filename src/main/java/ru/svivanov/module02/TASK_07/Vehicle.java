package ru.svivanov.module02.TASK_07;

public abstract class Vehicle {
    private String size;
    private int power;

    public Vehicle(String size, int power) {
        this.size = size;
        this.power = power;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
