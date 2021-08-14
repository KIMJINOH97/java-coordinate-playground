package model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

    @Test
    public void 라인_길이_테스트(){
        List<Coordinate> coords = Arrays.asList(new Coordinate(0, 0), new Coordinate(0, 1));

        Line line = new Line(coords);
        assertThat(line.length()).isEqualTo(1.000, Offset.offset(0.001));
    }

}
