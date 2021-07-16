package location;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RectangleTest {

    @Test
    void 좌표_모든_변_길이(){
        List<Location> locations = Arrays.asList(new Location(new Coordinate(1), new Coordinate(1)),
                new Location(new Coordinate(1), new Coordinate(4)),
                new Location(new Coordinate(2), new Coordinate(1)),
                new Location(new Coordinate(2), new Coordinate(2)));

        LineUtils lineUtils = new LineUtils(locations);
        List<Double> allLine = lineUtils.getAllLine();
        for (Double aDouble : allLine) {
            System.out.println("aDouble = " + aDouble);
        }
        assertThat(allLine.size()).isEqualTo(6);
    }

    @Test
    void 마름모_실패(){
        List<Location> locations = Arrays.asList(new Location(new Coordinate(2), new Coordinate(2)),
                new Location(new Coordinate(2), new Coordinate(0)),
                new Location(new Coordinate(0), new Coordinate(1)),
                new Location(new Coordinate(4), new Coordinate(1)));
        LineUtils lineUtils = new LineUtils(locations);
        List<Double> allLine = lineUtils.getAllLine();
        for (Double aDouble : allLine) {
            System.out.println("aDouble = " + aDouble);
        }
        assertThatThrownBy(()-> new Rectangle(locations)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 사각형_검증_성공(){
        List<Location> locations = Arrays.asList(new Location(new Coordinate(1), new Coordinate(1)),
                new Location(new Coordinate(1), new Coordinate(2)),
                new Location(new Coordinate(2), new Coordinate(1)),
                new Location(new Coordinate(2), new Coordinate(2)));
        Rectangle rectangle = new Rectangle();
        assertThat(rectangle.validateRectangle(locations)).isTrue();
    }

    @Test
    void 사각형_검증_실패_똑같은_좌표_존재(){
        List<Location> locations = Arrays.asList(new Location(new Coordinate(1), new Coordinate(1)),
                new Location(new Coordinate(1), new Coordinate(2)),
                new Location(new Coordinate(2), new Coordinate(1)),
                new Location(new Coordinate(2), new Coordinate(1)));

        Rectangle rectangle = new Rectangle();
        assertThat(rectangle.validateRectangle(locations)).isFalse();
        assertThatThrownBy(()-> new Rectangle(locations)).isInstanceOf(IllegalArgumentException.class);
    }
}
