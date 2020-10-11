package ru.svivanov.module02.FINAL_TASK.figures.black;

import ru.svivanov.module02.FINAL_TASK.figures.Figure;
import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.FigureLogic;

public class QueenBlack extends Figure {

    public QueenBlack(Cell position) {
        super(position);
    }

    @Override
    public boolean way(Cell source, Cell dest) {
        return false;
    }


    @Override
    public FigureLogic copy(Cell dest) {
        return new QueenBlack(dest);
    }
}
