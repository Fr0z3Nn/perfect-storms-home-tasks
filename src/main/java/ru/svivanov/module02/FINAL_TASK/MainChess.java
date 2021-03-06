package ru.svivanov.module02.FINAL_TASK;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import ru.svivanov.module02.FINAL_TASK.figures.black.*;
import ru.svivanov.module02.FINAL_TASK.figures.white.*;
import ru.svivanov.module02.FINAL_TASK.logic.Cell;
import ru.svivanov.module02.FINAL_TASK.logic.FigureLogic;
import ru.svivanov.module02.FINAL_TASK.logic.Logic;


public class MainChess extends Application {
    private static final String appName = "Chess for Perfect Storms";
    private final int size = 8;
    private final Logic logic = new Logic();

    private Rectangle buildRectangle(int x, int y, int size, boolean white) {
        Rectangle rect = new Rectangle();
        rect.setX(x * size);
        rect.setY(y * size);
        rect.setHeight(size);
        rect.setWidth(size);
        if (white) {
            rect.setFill(Color.WHITE);
        } else {
            rect.setFill(Color.GRAY);
        }
        rect.setStroke(Color.BLACK);
        return rect;
    }

    private void refresh(BorderPane border) {
        Group grid = this.buildGrid();
        this.logic.clean();
        this.buildWhiteTeam(grid);
        this.buildBlackTeam(grid);
        border.setCenter(grid);


    }

    private Rectangle buildFigure(int x, int y, int size, String image) {
        Rectangle rect = new Rectangle();
        rect.setX(x);
        rect.setY(y);
        rect.setHeight(size);
        rect.setWidth(size);
        Image img = new Image(this.getClass().getClassLoader().getResource(image).toString());
        rect.setFill(new ImagePattern(img));
        final Rectangle momento = new Rectangle(x, y);
        rect.setOnScroll(event -> {
            rect.setX(250);
            rect.setY(-50);
        });
        rect.setOnDragDetected(event -> {
            momento.setX(event.getX());
            momento.setY(event.getY());
        });
        rect.setOnMouseDragged(event -> {
            rect.setX(event.getX() - size / 2);
            rect.setY(event.getY() - size / 2);
        });
        // replace
        rect.setOnMouseReleased(event -> {
            if (logic.move(this.findBy(momento.getX(), momento.getY()), this.findBy(event.getX(), event.getY()))) {
                rect.setX((int)(event.getX() / 40) * 40 + 5);
                rect.setY((int)(event.getY() / 40) * 40 + 5);
            } else {
                rect.setX((int)( momento.getX() / 40) * 40 + 5);
                rect.setY((int)( momento.getY() / 40) * 40 + 5);

            }
        });

        return rect;

    }

    public void add(FigureLogic figure, Group grid) {
        this.logic.add(figure);
        Cell position = figure.position();
        grid.getChildren().add(
                this.buildFigure(
                        position.x * 40 + 5,
                        position.y * 40 + 5,
                        30,
                        figure.icon()
                )
        );
    }

    private Cell findBy(double graphX, double graphY) {
        Cell cls = Cell.A1;
        int x = (int) graphX / 40;
        int y = (int) graphY / 40;
        for (Cell cell : Cell.values()) {
            if (cell.x == x && cell.y == y) {
                cls = cell;
            }
        }
        return cls;
    }

    private void buildBlackTeam(Group grid) {
        this.add(new PawnBlack(Cell.A2), grid);
        this.add(new PawnBlack(Cell.B2), grid);
        this.add(new PawnBlack(Cell.C2), grid);
        this.add(new PawnBlack(Cell.D2), grid);
        this.add(new PawnBlack(Cell.E2), grid);
        this.add(new PawnBlack(Cell.F2), grid);
        this.add(new PawnBlack(Cell.G2), grid);
        this.add(new PawnBlack(Cell.H2), grid);
        this.add(new RookBlack(Cell.A1),grid);
        this.add(new KnightBlack(Cell.B1),grid);
        this.add(new BishopBlack(Cell.C1),grid);
        this.add(new QueenBlack(Cell.D1),grid);
        this.add(new KingBlack(Cell.E1),grid);
        this.add(new BishopBlack(Cell.F1),grid);
        this.add(new KnightBlack(Cell.G1),grid);
        this.add(new RookBlack(Cell.H1),grid);
    }

    private void buildWhiteTeam(Group grid) {
        this.add(new PawnWhite(Cell.A7),grid);
        this.add(new PawnWhite(Cell.B7),grid);
        this.add(new PawnWhite(Cell.D7),grid);
        this.add(new PawnWhite(Cell.C7),grid);
        this.add(new PawnWhite(Cell.E7),grid);
        this.add(new PawnWhite(Cell.F7),grid);
        this.add(new PawnWhite(Cell.G7),grid);
        this.add(new PawnWhite(Cell.H7),grid);
        this.add(new RookWhite(Cell.A8),grid);
        this.add(new KnightWhite(Cell.B8),grid);
        this.add(new BishopWhite(Cell.C8),grid);
        this.add(new QueenWhite(Cell.D8),grid);
        this.add(new KingWhite(Cell.E8),grid);
        this.add(new BishopWhite(Cell.F8),grid);
        this.add(new KnightWhite(Cell.G8),grid);
        this.add(new RookWhite(Cell.H8),grid);
    }

    private Group buildGrid() {
        Group panel = new Group();
        for (int y = 0; y != this.size; y++) {
            for (int x = 0; x != this.size; x++) {
                panel.getChildren().add(
                        this.buildRectangle(x, y, 40, (x + y) % 2 == 0)
                );
            }
        }
        return panel;
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane border = new BorderPane();
        HBox control = new HBox();
        control.setPrefHeight(40);
        control.setSpacing(10);
        control.setAlignment(Pos.BASELINE_CENTER);
        Button start = new Button("ПОЕХАЛИ!");
        start.setOnMouseClicked(event -> {
            this.refresh(border);
        });
        control.getChildren().addAll(start);
        border.setBottom(control);
        border.setCenter(this.buildGrid());
        stage.setScene(new Scene(border,500,500));
        stage.setTitle(appName);
        stage.setResizable(false);
        stage.show();
        //his.refresh(border);
    }
}
