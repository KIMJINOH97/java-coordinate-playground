package model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinateTest {

    @Test
    public void 좌표_유효성_테스트(){
        int x1 = 0;
        int x2 = 24;
        int x3 = 25;
        int x4 = -1;

        assertThat(Coordinate.exceed(x1)).isFalse();
        assertThat(Coordinate.exceed(x2)).isFalse();
        assertThat(Coordinate.exceed(x3)).isTrue();
        assertThat(Coordinate.exceed(x4)).isTrue();
    }

    @Test
    public void 좌표_생성_오류_테스트(){
        assertThatThrownBy(() -> new Coordinate(25, 13)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Coordinate(-1, 13)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Coordinate(0, 25)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 좌표간_길이_테스트() {
        Coordinate line1 = new Coordinate(0, 0);
        Coordinate line2 = new Coordinate(1, 1);
        Coordinate line3 = new Coordinate(1, 3);

        assertThat(line1.length(line2)).isEqualTo(1.414, Offset.offset(0.001));
        assertThat(line2.length(line1)).isEqualTo(1.414, Offset.offset(0.001));
        assertThat(line2.length(line3)).isEqualTo(2.000, Offset.offset(0.001));
    }

    @Test
    public void 좌표간_기울기_테스트(){
        Coordinate coord1 = new Coordinate(0, 0);
        Coordinate coord2 = new Coordinate(1, 1);
        Coordinate coord3 = new Coordinate(0, 1);
        Coordinate coord4 = new Coordinate(1, 0);

        assertThat(coord1.slope(coord2)).isEqualTo(1.000, Offset.offset(0.001));
        assertThat(coord1.slope(coord3)).isEqualTo(Double.MAX_VALUE, Offset.offset(0.001));
        assertThat(coord1.slope(coord4)).isEqualTo(0.000, Offset.offset(0.001));
    }

}
