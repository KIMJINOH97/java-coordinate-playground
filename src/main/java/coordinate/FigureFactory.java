package coordinate;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FigureFactory {

    public static final int LINE_POINT_SIZE = 2;
    public static final int TRIANGLE_POINT_SIZE = 3;
    public static final int RECTANGLE_POINT_SIZE = 4;

    private static final Map<Integer, Function<List<Point>, AbstractFigure>> figureFactory = new HashMap<>();

    static Figure getInstance(List<Point> points) {

        if (figureFactory.size() == 0) {
            figureFactory.put(LINE_POINT_SIZE, p -> new Line(p));
            figureFactory.put(TRIANGLE_POINT_SIZE, p -> new Triangle(p));
            figureFactory.put(RECTANGLE_POINT_SIZE, p -> new Rectangle(p));
        }

        if (figureFactory.containsKey(points.size())){
            return figureFactory.get(points.size()).apply(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
