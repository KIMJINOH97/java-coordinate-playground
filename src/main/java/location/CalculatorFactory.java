package location;

import java.util.List;

public class CalculatorFactory {
    public static Calculator create(List<Location> locations) {
        if(locations.size() == 3){
            return new RectangleCalculator(locations);
        }

        if (locations.size() == 4){
            return new RectangleCalculator(locations);
        }
        return new LineCalculator(locations);
    }
}
