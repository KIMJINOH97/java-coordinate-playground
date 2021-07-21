import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class LineTest {

    @Test
    void 라인_검증(){
        assertThatThrownBy(() -> new Line(Arrays.asList(Point.of(0, 24))))
                .isInstanceOf(IllegalArgumentException.class).hasMessageContaining("점의 개수를 맞춰주세요");

        assertThatThrownBy(() -> new Line(Arrays.asList(Point.of(0, 24), Point.of(0, 20), Point.of(1, 24))))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 라인_길이_계산(){
        Line line = new Line(Arrays.asList(Point.of(1, 1), Point.of(2, 2)));

        assertThat(line.calculate()).isEqualTo(1.414, offset(0.00099));
    }

}
