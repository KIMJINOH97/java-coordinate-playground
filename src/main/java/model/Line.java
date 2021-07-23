package model;

import java.util.List;

public class Line extends AbstractFigure{

    public Line(List<Point> points) {
        super(points);
    }

    public Point getPoint(int index){
        return getPoints().get(index);
    }

    @Override
    public String name() {
        return "라인";
    }

    @Override
    public int size() {
        return FigureFactory.LINE_SIZE;
    }

    @Override
    public double calculate() {
        return getPoint(0).calculate(getPoint(1));
    }

}
