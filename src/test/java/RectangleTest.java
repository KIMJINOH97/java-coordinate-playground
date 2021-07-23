import model.Point;
import model.Rectangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RectangleTest {

    private List<Point> points;

    @BeforeEach
    void init(){
        points = Arrays.asList(Point.of(0,0), Point.of(1,0),
                Point.of(0,1), Point.of(1,1));
    }


    @Test
    void 사각형_검증_성공(){
        Rectangle rectangle = new Rectangle(points);
        assertThat(rectangle.name()).isEqualTo("사각형");
    }

    @Test
    void 사각형_검증_실패(){
        List<Point> failPoints = Arrays.asList(Point.of(0,0), Point.of(0,1),
                Point.of(0,0), Point.of(0,2));
        assertThatThrownBy(() -> new Rectangle(failPoints)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사각형_넓이(){
        Rectangle rectangle = new Rectangle(points);
        assertThat(rectangle.calculate()).isEqualTo(1);
    }

    @AfterEach
    void destory(){
        points = null;
    }

}
