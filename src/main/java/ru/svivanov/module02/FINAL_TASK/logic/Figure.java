package ru.svivanov.module02.FINAL_TASK.logic;

public interface Figure {
    Cell position();
    Cell[] way(Cell source, Cell dest);
    default String icon(){
        System.out.println(String.format("%s.png",this.getClass().getSimpleName()));
        return String.format("%s.png",this.getClass().getSimpleName());
    }

    Figure copy(Cell dest);
}
