package model;

import java.util.Objects;

public class Coordinate {
    public static int MIN_COORDINATE = 0;
    public static int MAX_COORDINATE = 24;
    public static String EXCEED_RANGE_MESSAGE = "좌표의 범위는 " + MIN_COORDINATE + "이상 " + MAX_COORDINATE + "이하이어야 합니다.";

    int x;
    int y;

    public Coordinate(int x, int y) {
        if (exceed(x) || exceed(y)){
            throw new IllegalArgumentException(EXCEED_RANGE_MESSAGE);
        }
        this.x = x;
        this.y = y;
    }

    public double length(Coordinate coordinate){
        return Math.sqrt(Math.pow(coordinate.x - x, 2) + Math.pow(coordinate.y - y, 2));
    }

    public static boolean exceed(int x) {
        return x < MIN_COORDINATE || x > MAX_COORDINATE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double slope(Coordinate coord) {
        if (coord.x == x){
            return Double.MAX_VALUE;
        }

        return (coord.y - y) / (coord.x - x);
    }
}
