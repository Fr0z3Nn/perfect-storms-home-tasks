package ru.svivanov.module02.FINAL_TASK.figures.black;

import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.Figure;

public class PawnBlack implements Figure {
    private final Cell position;

    public PawnBlack(Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        Cell[] steps = new Cell[0];
        if (source.y == dest.x + 1 && source.x == dest.x){
            steps = new Cell[]{dest};
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnBlack(dest);
    }
}
