package ru.svivanov.module02.FINAL_TASK.figures.white;

import ru.svivanov.module02.FINAL_TASK.figures.Figure;
import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.FigureLogic;

public class KnightWhite extends Figure {
    public KnightWhite(Cell position) {
        super(position);
    }

    @Override
    public boolean way(Cell source, Cell dest) {
        return false;
    }


    @Override
    public FigureLogic copy(Cell dest) {
        return new KnightWhite(dest);
    }
}
