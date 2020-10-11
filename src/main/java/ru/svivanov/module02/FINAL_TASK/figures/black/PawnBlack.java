package ru.svivanov.module02.FINAL_TASK.figures.black;

import ru.svivanov.module02.FINAL_TASK.figures.Figure;
import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.FigureLogic;

public class PawnBlack extends Figure {

    public PawnBlack(Cell position) {
        super(position);
    }

    @Override
    public boolean way(Cell source, Cell dest) {
        if(source.y == 1 && (dest.y == 2 || dest.y == 3) && source.x == dest.x) return true;
        if(source.y + 1 == dest.y && source.x == dest.x) return true;
        return false;
    }

    @Override
    public FigureLogic copy(Cell dest) {
        return new PawnBlack(dest);
    }
}
