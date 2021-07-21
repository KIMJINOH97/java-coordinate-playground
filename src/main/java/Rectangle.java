import java.util.List;

public class Rectangle implements Figure {

    private final List<Point> points;

    public Rectangle(List<Point> points) {
        if (points.size() != size()){
            throw new IllegalArgumentException("점의 개수가 4개여야 합니다.");
        }

        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
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
        return 0;
    }

}
