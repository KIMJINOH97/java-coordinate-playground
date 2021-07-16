package location;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorFactoryTest {

    @Test
    void 점_네개일_때(){
        List<Location> locations = new ArrayList<>();
        locations.add(new Location(new Coordinate(1), new Coordinate(1)));
        locations.add(new Location(new Coordinate(1), new Coordinate(2)));
        locations.add(new Location(new Coordinate(2), new Coordinate(1)));
        locations.add(new Location(new Coordinate(2), new Coordinate(2)));

        Calculator calculator = CalculatorFactory.create(locations);

        assertThat(calculator).isInstanceOf(RectangleCalculator.class);
    }

    @Test
    void 점_두개일_떄(){
        List<Location> locations = new ArrayList<>();
        locations.add(new Location(new Coordinate(1), new Coordinate(1)));
        locations.add(new Location(new Coordinate(1), new Coordinate(2)));

        Calculator calculator = CalculatorFactory.create(locations);

        assertThat(calculator).isInstanceOf(LineCalculator.class);
    }
}
