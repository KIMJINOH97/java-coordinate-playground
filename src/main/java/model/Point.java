package model;

public class Point {

    private static final int MIN_POINT_VALUE = 0;
    private static final int MAX_POINT_VALUE = 24;
    private static final String EXCEED_VALUE = MIN_POINT_VALUE + "이상 " + MAX_POINT_VALUE + "의 값이 와야합니다.";

    private final int x;
    private final int y;

    public Point(int x, int y){
        if (isAble(x) || isAble(y)){
           throw new IllegalArgumentException(EXCEED_VALUE);
        }

        this.x = x;
        this.y = y;
    }

    private boolean isAble(int coord) {
        return coord < 0 || coord > 24;
    }

    public static Point of(int x, int y){
        return new Point(x, y);
    }

    public int minusX(int x){
        return this.x - x;
    }

    public int minusY(int y){
        return this.y - y;
    }

    private double multiple(int num) {
        return Math.pow(num, 2);
    }

    public double calculate(Point point2) {
        return Math.sqrt(multiple(minusY(point2.y)) + multiple(minusX(point2.x)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double slope(Point point) {
        if (point.x == x){
            return Double.MAX_VALUE;
        }

        return Math.abs((double) minusY(point.y) / minusX(point.x));
    }
}
