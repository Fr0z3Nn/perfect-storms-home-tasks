package ru.svivanov.module02.FINAL_TASK.logic;

public interface FigureLogic {
    Cell position();
    Cell[] way(Cell source, Cell dest);
    default String icon(){
        return String.format("%s.png",this.getClass().getSimpleName());
    }

    FigureLogic copy(Cell dest);
}
