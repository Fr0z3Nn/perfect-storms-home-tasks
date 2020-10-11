package ru.svivanov.module02.FINAL_TASK.figures;

import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.FigureLogic;

public abstract class Figure implements FigureLogic {
    private final Cell position;

    public Figure(Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public abstract Cell[] way(Cell source, Cell dest);

    @Override
    public abstract FigureLogic copy(Cell dest);

}
