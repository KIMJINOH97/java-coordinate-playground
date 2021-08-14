package model;

import java.util.List;

public class Line extends FigureCommon implements Figure{

    public Line(List<Coordinate> coordinates){
        super(coordinates);
        this.coordinates = coordinates;
    }

    @Override
    public String name() {
        return "라인";
    }

    @Override
    public double length() {
        return coordinates.get(0).length(coordinates.get(1));
    }

}
