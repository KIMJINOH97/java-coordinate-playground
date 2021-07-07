package fuel;

import fuel.car.Avante;
import fuel.car.Car;
import fuel.car.CarKinds;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Car> cars = new ArrayList<>();
    private String result = "";

    public static Company create(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Avante());

        return new Company(cars);
    }

    public Company(){}

    public Company(List<Car> cars){
        this.cars = cars;
    }

    public void add(Car car){
        if (car.correctKind(CarKinds.AVANTE)){
            result += printFuel(CarKinds.AVANTE, car.countFuel());
            return;
        }

        if (car.correctKind(CarKinds.SONATA)){
            result += printFuel(CarKinds.SONATA, car.countFuel());
            return;
        }

        if (car.correctKind(CarKinds.K5)){
            result += printFuel(CarKinds.K5, car.countFuel());
            return;
        }
    }

    public String printFuel(CarKinds kind, double fuel){
        return kind + " " + fuel + "L\n";
    }

    public void report(){
        System.out.println("*****결과*****\n" + result);
    }
}
