package location;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

    @Test
    void 라인_길이_측정(){
        Location location = new Location(new Coordinate(1), new Coordinate(1));
        Location location1 = new Location(new Coordinate(1), new Coordinate(2));

        Line line = new Line(location, location1);

        assertThat(line.length()).isEqualTo(1);
    }

}
