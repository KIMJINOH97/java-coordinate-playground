import model.Point;
import model.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TriangleTest {

    private List<Point> points;

    @BeforeEach
    void init(){
        points = Arrays.asList(Point.of(0,0), Point.of(1,0), Point.of(1,1));
    }

    @Test
    void 삼각형_검증_성공(){
        List<Point> points = Arrays.asList(Point.of(0,0), Point.of(1,0), Point.of(1,1));
        Triangle triangle = new Triangle(points);
        assertThat(triangle.name()).isEqualTo("삼각형");
    }

    @Test
    void 삼각형_검증_실패(){
        assertThatThrownBy(() -> new Triangle(Arrays.asList(Point.of(0,0), Point.of(1,0), Point.of(2,0))))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 삼각형_넓이(){
        Triangle triangle = new Triangle(points);
        assertThat(triangle.calculate()).isEqualTo(0.500, offset(0.00099));
    }

    @AfterEach
    void destory(){
        points = null;
    }
}
