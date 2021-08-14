package model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class FigureFactoryTest {

    @Test
    public void 라인_테스트(){
        Figure figure = FigureFactory.make(Arrays.asList(new Coordinate(0, 0), new Coordinate(0, 1)));

        assertThat(figure.name()).isEqualTo("라인");
    }

    @Test
    public void 사각형_테스트(){
        Figure figure = FigureFactory.make(Arrays.asList(new Coordinate(0, 0), new Coordinate(0, 1),
                new Coordinate(1, 0), new Coordinate(1, 1)));

        assertThat(figure.name()).isEqualTo("사각형");
    }

    @Test
    public void 삼각형_테스트(){
        Figure figure = FigureFactory.make(Arrays.asList(new Coordinate(0, 0), new Coordinate(0, 1),
                new Coordinate(1, 1)));

        assertThat(figure.name()).isEqualTo("삼각형");
    }


}