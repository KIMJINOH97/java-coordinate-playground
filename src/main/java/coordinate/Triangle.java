package coordinate;

import java.util.List;

import static coordinate.FigureFactory.TRIANGLE_POINT_SIZE;

public class Triangle extends AbstractFigure {

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return TRIANGLE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    @Override
    public double area() {
        return 0;
    }
}
