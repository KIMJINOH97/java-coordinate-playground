package coordinate;

import java.util.List;
import static coordinate.FigureFactory.LINE_POINT_SIZE;

public class Line extends AbstractFigure {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return LINE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return "선";
    }

    @Override
    public double area() {
        return 0;
    }
}
