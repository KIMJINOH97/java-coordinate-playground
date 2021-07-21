public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        if (x < 0 || x > 24){
           throw new IllegalArgumentException("0이상 24의 값이 와야합니다.");
        }

        if (y < 0 || y > 24){
            throw new IllegalArgumentException("0이상 24의 값이 와야합니다.");
        }

        this.x = x;
        this.y = y;
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
        return num * num;
    }

    public double calculate(Point point2) {
        return Math.sqrt(multiple(minusY(point2.getY())) + multiple(minusX(point2.getX())));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
