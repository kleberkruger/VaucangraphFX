package com.fxgraph.cells;

import com.fxgraph.graph.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class TriangleCell extends Cell {

    public TriangleCell(String id) {
        super(id);

        double width = 50;
        double height = 50;

        Polygon view = new Polygon(width / 2, 0, width, height, 0, height);
        view.setStrokeWidth(3);
        view.setStroke(Color.DARKSLATEBLUE);
        view.setFill(Color.RED);

        setView(view);
    }

}