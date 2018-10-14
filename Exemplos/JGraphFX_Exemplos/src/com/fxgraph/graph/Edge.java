package com.fxgraph.graph;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Edge extends Group {

    protected Cell source;
    protected Cell target;

    private Line line;

    public Edge(Cell source, Cell target) {

        this.source = source;
        this.target = target;

        source.addCellChild(target);
        target.addCellParent(source);

        line = new Line();
        line.setStrokeWidth(2);

        line.startXProperty().bind(source.layoutXProperty().add(source.getBoundsInParent().getWidth() / 2.0));
        line.startYProperty().bind(source.layoutYProperty().add(source.getBoundsInParent().getHeight() / 2.0));

        line.endXProperty().bind(target.layoutXProperty().add( target.getBoundsInParent().getWidth() / 2.0));
        line.endYProperty().bind(target.layoutYProperty().add( target.getBoundsInParent().getHeight() / 2.0));

        getChildren().add(line);

        setOnMousePressed(event -> line.setStroke(Color.RED));
        setOnMouseReleased(event -> line.setStroke(Color.BLACK));
    }

    public Cell getSource() {
        return source;
    }

    public Cell getTarget() {
        return target;
    }

}