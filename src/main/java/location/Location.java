package location;

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
}