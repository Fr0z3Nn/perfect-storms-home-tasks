package ru.svivanov.module02.FINAL_TASK.figures.white;

import ru.svivanov.module02.FINAL_TASK.figures.Figure;
import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.FigureLogic;

public class QueenWhite extends Figure {
    public QueenWhite(Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[0];
    }

    @Override
    public FigureLogic copy(Cell dest) {
        return new QueenWhite(dest);
    }
}