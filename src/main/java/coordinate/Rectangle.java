package coordinate;

import java.util.List;

import static coordinate.FigureFactory.RECTANGLE_POINT_SIZE;

public class Rectangle extends AbstractFigure {

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return RECTANGLE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    public double area() {
        return 0;
    }
}
