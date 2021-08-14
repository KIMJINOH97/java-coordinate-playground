package model;

import java.util.List;

public abstract class FigureCommon {

    List<Coordinate> coordinates;

    public FigureCommon(List<Coordinate> coordinates){
        this.coordinates = coordinates;
    }

}
