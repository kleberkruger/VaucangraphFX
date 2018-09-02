package com.fxgraph.cells;

import com.fxgraph.graph.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleCell extends Cell {

    public CircleCell(String id) {
        super(id);

        Circle view = new Circle(25, 25, 25);
        view.setStrokeWidth(3);
        view.setStroke(Color.DARKSLATEBLUE);
        view.setFill(Color.DODGERBLUE);

        setView(view);
    }
}
