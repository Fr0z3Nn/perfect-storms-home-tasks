package ru.svivanov.module02.FINAL_TASK.figures.black;

import ru.svivanov.module02.FINAL_TASK.figures.Figure;
import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.FigureLogic;

public class RookBlack extends Figure {

    public RookBlack(Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        return new Cell[0];
    }

    @Override
    public FigureLogic copy(Cell dest) {
        return new RookBlack(dest);
    }
}
