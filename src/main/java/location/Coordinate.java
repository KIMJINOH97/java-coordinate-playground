package location;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return coordinate == that.coordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }
}
