package model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TriangleTest {

    @Test
    public void 삼각형_검증_테스트(){
        List<Coordinate> coordinates1 = Arrays.asList(new Coordinate(0, 0), new Coordinate(0, 1),
                new Coordinate(0, 2));
        List<Coordinate> coordinates2 = Arrays.asList(new Coordinate(1, 0), new Coordinate(1, 1),
                new Coordinate(1, 2));
        List<Coordinate> coordinates3 = Arrays.asList(new Coordinate(0, 0), new Coordinate(1, 1),
                new Coordinate(2, 2));

        assertThatThrownBy(() -> new Triangle(coordinates1)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Triangle(coordinates2)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Triangle(coordinates3)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 삼각형_넓이_테스트(){
        Triangle triangle = new Triangle(Arrays.asList(new Coordinate(0, 0), new Coordinate(1, 1),
                new Coordinate(2, 0)));

        assertThat(triangle.length()).isEqualTo(1.000, offset(0.001));
    }

}
