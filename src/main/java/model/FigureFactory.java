package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    public static final int LINE_SIZE = 2;
    public static final int TRIANGLE_SIZE = 3;
    public static final int RECTANGLE_SIZE = 4;

    private static final Map<Integer, Function<List<Point>, Figure>> map = new HashMap<>();

    public static Figure create(List<Point> points){
        if (map.size() == 0){
            map.put(LINE_SIZE, (point -> new Line(point)));
            map.put(TRIANGLE_SIZE, (point -> new Triangle(point)));
            map.put(RECTANGLE_SIZE, (point -> new Rectangle(point)));
        }

        if (map.containsKey(points.size())){
            return map.get(points.size()).apply(points);
        }

        throw new IllegalArgumentException("유효하지 않은 점들 입니다.");
    }
}
