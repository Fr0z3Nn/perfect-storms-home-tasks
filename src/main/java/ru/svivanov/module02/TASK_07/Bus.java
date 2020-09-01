package ru.svivanov.module02.TASK_07;

public abstract class Bus extends Vehicle{
    private int numberSeats;

    public Bus(String size, int power, int numberSeats) {
        super(size, power);
        this.numberSeats = numberSeats;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
}
