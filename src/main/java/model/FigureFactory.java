package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    private static String NULL_EXCEPTION = "NULL 값은 인자가 될 수 없습니다.";
    private static Map<Integer, Function<List<Coordinate>, Figure>> map = new HashMap<>();

    static {
        map.put(2, (coordinates) -> new Line(coordinates));
        map.put(3, (coordinates) -> new Triangle(coordinates));
        map.put(4, (coordinates) -> new Rectangle(coordinates));
    }

    public static Figure make(List<Coordinate> coordinates){

        if (coordinates == null){
            throw new IllegalArgumentException(NULL_EXCEPTION);
        }

        return map.get(coordinates.size()).apply(coordinates);
    }

}
