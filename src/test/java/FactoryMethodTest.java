import model.Figure;
import model.FigureFactory;
import model.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    void 팩토리매서드_테스트(){
        Figure line = FigureFactory.create(Arrays.asList(Point.of(0,24), Point.of(0,0)));
//        model.Figure line = model.FigureFactory.create(Arrays.asList(model.Point.of(0,24), model.Point.of(0,0)));
        Figure rectangle = FigureFactory.create(Arrays.asList(Point.of(0,24), Point.of(0,0), Point.of(24,0), Point.of(24,24)));

        assertThat(line.name()).isEqualTo("라인");
        assertThat(rectangle.name()).isEqualTo("사각형");
    }

}
