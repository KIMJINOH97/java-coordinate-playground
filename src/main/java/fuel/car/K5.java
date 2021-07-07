package fuel.car;

public class K5 implements Car{

    private CarKinds kind = CarKinds.K5;
    private static final double K5_DISTANCE_PER_FUEL = 13;
    private double distance;

    public K5() {
    }

    public K5(double distance) {
        this.distance = distance;
    }

    @Override
    public double countFuel(){
        return this.distance/K5_DISTANCE_PER_FUEL;
    }

    @Override
    public boolean correctKind(CarKinds kind) {
        return this.kind == kind;
    }

}
