import model.Figure;
import model.Line;
import model.Point;
import model.Rectangle;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FigureTest {

    @Test
    void 다형성_테스트(){
        Figure line = new Line(Arrays.asList(Point.of(0,24), Point.of(2,4)));
        assertThat(line.name()).isEqualTo("라인");
        assertThat(line.size()).isEqualTo(2);

        Figure rectangle = new Rectangle(Arrays.asList(Point.of(0,0), Point.of(0,1), Point.of(1,1), Point.of(1,0)));
        assertThat(rectangle.name()).isEqualTo("사각형");
        assertThat(rectangle.size()).isEqualTo(4);
    }


}
