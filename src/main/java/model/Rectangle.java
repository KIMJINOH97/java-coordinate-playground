package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Rectangle extends FigureCommon implements Figure{

    public static int RECTANGLE_SIZE = 4;
    public static int SAME_X_OR_Y_COUNT = 2;
    public static String NOT_RECTANGLE_EXCEPTION = "사각형이 검증에 실패했습니다.";

    public Rectangle(List<Coordinate> coordinates) {
        super(coordinates);
        if (!validate(coordinates)){
            throw new IllegalArgumentException(NOT_RECTANGLE_EXCEPTION);
        }
    }

    public static Set<Integer> findSameX(List<Coordinate> coords) {
        Set<Integer> setX = coords.stream()
                .map(coordinate -> coordinate.x)
                .collect(Collectors.toSet());

        return setX;
    }

    public static Set<Integer> findSameY(List<Coordinate> coords) {
        Set<Integer> setY = coords.stream()
                .map(coordinate -> coordinate.y)
                .collect(Collectors.toSet());

        return setY;
    }

    public static boolean validate(List<Coordinate> coordinates) {
        Set<Coordinate> coords = coordinates.stream()
                .collect(Collectors.toSet());

        if (checkSameCoordinate(coords)){
            return false;
        }

        Set<Integer> sameX = findSameX(coordinates);
        Set<Integer> sameY = findSameY(coordinates);

        if (!checkHasTwo(sameX) || !checkHasTwo(sameY)){
            return false;
        }
        return true;
    }

    private static boolean checkHasTwo(Set<Integer> same) {
        return same.size() == SAME_X_OR_Y_COUNT;
    }

    private static boolean checkSameCoordinate(Set<Coordinate> coords) {
        return coords.size() != RECTANGLE_SIZE;
    }

    public double betweenPoints(Set<Integer> twoPoints){
        List<Integer> two = twoPoints.stream()
                .collect(Collectors.toList());
        return Math.abs(two.get(0) - two.get(1));
    }

    @Override
    public String name() {
        return "사각형";
    }

    @Override
    public double length() {
        return betweenPoints(findSameX(coordinates)) * betweenPoints(findSameY(coordinates));
    }
}
