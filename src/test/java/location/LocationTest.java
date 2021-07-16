package location;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LocationTest {

    private Location location1;
    private Location location2;

    @BeforeEach
    void init(){
        location1 = new Location(new Coordinate(1), new Coordinate(2));
        location2 = new Location(new Coordinate(2), new Coordinate(5));
    }

    @Test
    void 점값_받기(){
        assertThat(new Coordinate(24).getCoordinate()).isEqualTo(24);
        assertThatThrownBy(() -> new Coordinate(25)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 좌표x_y저장(){
        assertThat(location1.getLocationX().getCoordinate()).isEqualTo(1);
        assertThat(location1.getLocationY().getCoordinate()).isEqualTo(2);
    }

    @Test
    void 점과_점사이_거리_제곱(){
        Coordinate coordinate1 = new Coordinate(1);
        Coordinate coordinate2 = new Coordinate(3);

        assertThat(coordinate1.calculate(coordinate2)).isEqualTo(4);
    }

    @Test
    void 거리_구하기(){
        assertThat(location1.length(location2)).isEqualTo(3.162, offset(0.00099));
        assertThat(location2.length(location1)).isEqualTo(3.162, offset(0.00099));
    }

    @Test
    void 기울기_구하기(){
        assertThat(location1.slope(location2)).isEqualTo(3.000, offset(0.00099));
    }

}