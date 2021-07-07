package fuel.car;

public class Avante implements Car{

    private final CarKinds kind = CarKinds.AVANTE;
    private final double AVANTE_DISTANCE_PER_FUEL = 15;
    private double distance;

    public Avante() {
    }

    public Avante(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean correctKind(CarKinds kind){
        return this.kind == kind;
    }

    @Override
    public double countFuel() {
        return this.distance/AVANTE_DISTANCE_PER_FUEL;
    }

}
