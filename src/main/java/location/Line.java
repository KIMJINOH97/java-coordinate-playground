package location;

import java.util.List;

public class Line {

    private Location location1;
    private Location location2;

    public Line(Location location1, Location location2) {
        this.location1 = location1;
        this.location2 = location2;
    }

    public Line(List<Location> location) {
        this.location1 = location.get(0);
        this.location2 = location.get(0);
    }

    public double length() {
        return location1.length(location2);
    }

}
