import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void 좌표_0_24까지만생성(){
        Point point = new Point(0, 24);
        assertThat(point.getX()).isEqualTo(0);
        assertThatThrownBy(()-> new Point(0, 25)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()-> new Point(25, 25)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()-> new Point(-1, 25)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(()-> new Point(24, -1)).isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    void 좌표_x거리_y거리_계산(){
        Point point1 = new Point(2,5);
        Point point2 = new Point(1,4);

        assertThat(point1.minusX(point2.getX())).isEqualTo(1);
        assertThat(point1.minusY(point2.getY())).isEqualTo(1);
    }

    @Test
    void 좌표_거리_계산(){
        Point point1 = new Point(2,5);
        Point point2 = new Point(1,4);

        assertThat(point1.calculate(point2)).isEqualTo(1.414, offset(0.00099));
    }

}
