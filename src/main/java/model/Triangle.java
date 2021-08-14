package model;

import java.util.List;

public class Triangle extends FigureCommon implements Figure{

    public static String NOT_TRIANGLE_EXCEPTION = "삼각형 검증에 실패했습니다.";

    public Triangle(List<Coordinate> coordinates){
        super(coordinates);

        if (!validate(coordinates)) {
            throw new IllegalArgumentException(NOT_TRIANGLE_EXCEPTION);
        }
    }

    public boolean validate(List<Coordinate> coordinates) {
        return coordinates.get(0).slope(coordinates.get(1)) != coordinates.get(0).slope(coordinates.get(2));
    }

    @Override
    public String name() {
        return "삼각형";
    }

    @Override
    public double length() {
        return formula();
    }

    private double formula() {
        double side1 = coordinates.get(0).length(coordinates.get(1));
        double side2 = coordinates.get(0).length(coordinates.get(2));
        double side3 = coordinates.get(1).length(coordinates.get(2));

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

}
