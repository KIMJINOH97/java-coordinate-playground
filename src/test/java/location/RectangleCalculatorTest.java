package location;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class RectangleCalculatorTest {

    @Test
    void 사각형_넓이(){
        List<Location> locations = Arrays.asList(new Location(new Coordinate(1), new Coordinate(1)),
                new Location(new Coordinate(1), new Coordinate(2)),
                new Location(new Coordinate(2), new Coordinate(1)),
                new Location(new Coordinate(2), new Coordinate(2)));

        RectangleCalculator calculator = new RectangleCalculator(locations);
        assertThat(calculator.calculate()).isEqualTo(1, offset(0.00099));
    }


    @Test
    void 사각형_넓이2(){
        List<Location> locations = Arrays.asList(new Location(new Coordinate(0), new Coordinate(1)),
                new Location(new Coordinate(1), new Coordinate(0)),
                new Location(new Coordinate(1), new Coordinate(2)),
                new Location(new Coordinate(2), new Coordinate(1)));

        RectangleCalculator calculator = new RectangleCalculator(locations);
        assertThat(calculator.calculate()).isEqualTo(2, offset(0.00099));
    }

}