package location;

import java.util.Objects;

public class Location {

    private Coordinate locationX;
    private Coordinate locationY;

    public Location(Coordinate locationX, Coordinate locationY) {
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public Coordinate getLocationX() {
        return locationX;
    }

    public Coordinate getLocationY() {
        return locationY;
    }

    public double length(Location location) {
        int resultX = locationX.calculate(location.getLocationX());
        int resultY = locationY.calculate(location.getLocationY());
        return Math.sqrt(resultX + resultY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(locationX, location.locationX) && Objects.equals(locationY, location.locationY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationX, locationY);
    }
}