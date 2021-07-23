package model;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rectangle extends AbstractFigure {

    private static final String NOT_RECTANGLE = "사각형이 아닙니다.";
    private static final int EQUAL_VERTICS_SIZE = 2;

    public Rectangle(List<Point> points) {
        super(points);

        if (!validateRectangle(points)){
            throw new IllegalArgumentException(NOT_RECTANGLE);
        }
    }

    public boolean validateRectangle(List<Point> points) {
        Set<Integer> pointX = uniquePoint(points, Point::getX);
        Set<Integer> pointY = uniquePoint(points, Point::getY);

        if (isSameSize(pointX) && isSameSize(pointY)){
            return true;
        }

        return false;
    }

    private boolean isSameSize(Set<Integer> points) {
        return points.size() == EQUAL_VERTICS_SIZE;
    }

    public Set<Integer> uniquePoint(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(Collectors.toSet());
    }

    private int distanceOfTwoPoint(Set<Integer> point) {
        int[] points = point.stream().mapToInt(Integer::intValue).toArray();
        return Math.abs(points[0] - points[1]);
    }

    @Override
    public String name() {
        return "사각형";
    }

    @Override
    public int size() {
        return FigureFactory.RECTANGLE_SIZE;
    }

    @Override
    public double calculate() {
        Set<Integer> pointX = uniquePoint(getPoints(), Point::getX);
        Set<Integer> pointY = uniquePoint(getPoints(), Point::getY);

        return distanceOfTwoPoint(pointX) * distanceOfTwoPoint(pointY);
    }

}
