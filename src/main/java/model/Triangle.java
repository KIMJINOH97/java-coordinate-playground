package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangle extends AbstractFigure {

    private static final String NOT_TRIANGLE = "삼각형이 아닙니다.";
    private static final int SLOPE_COUNT = 1;

    public Triangle(List<Point> points) {
        super(points);

        if(existStraight(points)){
            throw new IllegalArgumentException(NOT_TRIANGLE);
        }
    }

    private boolean existStraight(List<Point> points) {
        return points.get(0).slope(points.get(1)) == points.get(0).slope(points.get(2));
    }

    @Override
    public String name() {
        return "삼각형";
    }

    @Override
    public int size() {
        return FigureFactory.TRIANGLE_SIZE;
    }

    @Override
    public double calculate() {

        List<Point> points = getPoints();
        double first = points.get(0).calculate(points.get(1));
        double second = points.get(0).calculate(points.get(2));
        double third = points.get(1).calculate(points.get(2));

        return herofomula(first,second,third);
    }

    private double herofomula(double first, double second, double third) {
        double s = (first + second + third) / 2;
        return Math.sqrt(s * (s - first) * (s - second) * (s - third));
    }
}
