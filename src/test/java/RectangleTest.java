import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RectangleTest {

    @Test
    void 사각형_생성(){
        List<Point> fourPoints = Arrays.asList(Point.of(0,0), Point.of(0,1), Point.of(0,0), Point.of(0,1));
        List<Point> threePoints = Arrays.asList(Point.of(0,0), Point.of(0,1), Point.of(0,0));
        Rectangle rectangle = new Rectangle(fourPoints);
        assertThat(rectangle.getPoints().size()).isEqualTo(4);
        assertThatThrownBy(() -> new Rectangle(threePoints)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사각형_계산(){

    }

}
