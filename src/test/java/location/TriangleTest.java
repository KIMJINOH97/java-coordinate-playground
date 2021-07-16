package location;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {

    @Test
    void 삼각형_검사(){
        List<Location> locations = Arrays.asList(Location.of(1,1), Location.of(1,2), Location.of(2, 1));
        assertThat(Triangle.validateTriangle(locations)).isTrue();
    }

    @Test
    void 삼각형_검증_실패(){
        List<Location> locations = Arrays.asList(Location.of(3,1), Location.of(4,1), Location.of(2, 1));
        assertThat(Triangle.validateTriangle(locations)).isFalse();
    }

    @Test
    void 삼각형_넓이(){
        List<Location> locations = Arrays.asList(Location.of(1,1), Location.of(1,2), Location.of(2, 1));
        Triangle triangle = new Triangle(locations);

        assertThat(triangle.calculate()).isEqualTo(0.500, offset(0.00099));
    }

    @Test
    void 삼각형_넓이2(){
        List<Location> locations = Arrays.asList(Location.of(1,1), Location.of(5,1), Location.of(3, 3));
        Triangle triangle = new Triangle(locations);

        assertThat(triangle.calculate()).isEqualTo(4.000, offset(0.00099));
    }

}
