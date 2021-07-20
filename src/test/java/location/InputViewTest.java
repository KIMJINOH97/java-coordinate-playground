package location;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    @Test
    void 분할_테스트(){
        String[] inputStr = {"(10,10)", "(14,15)", "(20,8)"};
        List<Location> locations = InputView.getLocations(inputStr);
        assertThat(locations.size()).isEqualTo(3);
    }

}