package com.fxgraph.cells;

import com.fxgraph.graph.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleCell extends Cell {

    public RectangleCell(String id) {
        super(id);

        Rectangle view = new Rectangle(50, 50);
        view.setStrokeWidth(3);
        view.setStroke(Color.DARKSLATEBLUE);
        view.setFill(Color.YELLOWGREEN);

        setView(view);
    }

}