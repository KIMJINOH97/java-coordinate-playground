package fuel.car;

public class Sonata implements Car{

    private CarKinds kind = CarKinds.SONATA;
    private static final double SONATA_DISTANCE_PER_FUEL = 10;

    private double distance;

    public Sonata() {
    }

    public Sonata(double distance) {
        this.distance = distance;
    }

    @Override
    public double countFuel() {
        return this.distance/SONATA_DISTANCE_PER_FUEL;
    }

    @Override
    public boolean correctKind(CarKinds kind) {
        return this.kind == kind;
    }

}
