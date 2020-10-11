package ru.svivanov.module02.FINAL_TASK.logic;

import ru.svivanov.module02.FINAL_TASK.figures.black.PawnBlack;
import ru.svivanov.module02.FINAL_TASK.figures.white.PawnWhite;

import java.util.Arrays;

public class Logic {
    private final FigureLogic[] figures = new FigureLogic[32];
    private int index = 0;

    public void add(FigureLogic figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) {
        boolean res = false;
        int indexSource = this.findBy(source);
        int indexDest = this.findBy(dest);


        if (this.figures[indexSource].way(source, dest)) {
                res = true;
                this.figures[indexSource] = this.figures[indexSource].copy(dest);
        }

        return res;
    }

    private int findBy(Cell cell) {
        int res = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                res = index;
                break;
            }
        }
        return res;
    }

    public void clean() {
        Arrays.fill(this.figures, null);
        this.index = 0;
    }

}
