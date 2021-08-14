package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class RectangleTest {
    List<Coordinate> coords;

    @BeforeEach
    public void init(){
        coords = Arrays.asList(new Coordinate(1, 1), new Coordinate(2, 1),
                new Coordinate(1, 5), new Coordinate(2, 5));
    }

    @Test
    public void x같은_좌표_y같은_좌표_나누기(){
        Set<Integer> setX = Rectangle.findSameX(coords);
        Set<Integer> setY = Rectangle.findSameY(coords);

        assertThat(setX.size()).isEqualTo(2);
        assertThat(setX).containsOnly(1, 2);
        assertThat(setY.size()).isEqualTo(2);
        assertThat(setY).containsOnly(1, 5);
    }

    @Test
    public void 사각형_검증_중복좌표(){
        List<Coordinate> coordinates = Arrays.asList(new Coordinate(1, 1), new Coordinate(2, 1),
                new Coordinate(1, 5), new Coordinate(1, 5));

        assertThat(Rectangle.validate(coordinates)).isFalse();
    }

    @Test
    public void 사각형_검증_x또는y가_같은_좌표_2개아닐_때(){
        // x 좌표 3개
        List<Coordinate> coordinates1 = Arrays.asList(new Coordinate(0, 1), new Coordinate(2, 1),
                new Coordinate(1, 5), new Coordinate(2, 5));

        // y 좌표 3개
        List<Coordinate> coordinates2 = Arrays.asList(new Coordinate(1, 1), new Coordinate(2, 1),
                new Coordinate(1, 5), new Coordinate(2, 6));

        // 일직선
        List<Coordinate> coordinates3 = Arrays.asList(new Coordinate(1, 2), new Coordinate(1, 3),
                new Coordinate(1, 5), new Coordinate(1, 6));

        assertThat(Rectangle.validate(coordinates1)).isFalse();
        assertThat(Rectangle.validate(coordinates2)).isFalse();
        assertThat(Rectangle.validate(coordinates3)).isFalse();
    }

    @Test
    public void 사각형_넓이_검증(){
        List<Coordinate> coordinates = Arrays.asList(new Coordinate(0, 0), new Coordinate(0, 1),
                new Coordinate(1, 0), new Coordinate(1, 1));

        Rectangle rectangle = new Rectangle(coordinates);
        assertThat(rectangle.length()).isEqualTo(1.000, offset(0.001));
    }

}
