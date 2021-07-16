package location;

import java.util.List;

public class LineCalculator implements Calculator{

    private Line line;

    public LineCalculator(List<Location> location) {
        this.line = new Line(location);
    }

    @Override
    public double calculate() {
        return line.length();
    }
}
