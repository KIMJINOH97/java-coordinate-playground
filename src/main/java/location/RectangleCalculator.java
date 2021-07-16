package location;

import java.util.List;

public class RectangleCalculator implements Calculator{

    private final Rectangle rectangle;

    public RectangleCalculator(List<Location> locations){
        this.rectangle = new Rectangle(locations);
    }

    @Override
    public double calculate() {
        return rectangle.size();
    }

}
