package location;

public class Coordinate {
    private final int coordinate;

    public Coordinate(int coordinate){
        if (coordinate > 24){
            throw new IllegalArgumentException();
        }
        this.coordinate = coordinate;
    }

    public int getCoordinate() {
        return coordinate;
    }

    public int calculate(Coordinate coor) {
        int minus = this.coordinate - coor.getCoordinate();
        return minus*minus;
    }
}
