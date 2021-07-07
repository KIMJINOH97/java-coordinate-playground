package fuel;

import fuel.car.Avante;
import fuel.car.K5;
import fuel.car.Sonata;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void 연료주입(){
        Company company = Company.create();

        company.add(new Sonata(150));
        company.add(new Avante(180));
        company.add(new K5(130));

        company.report();
    }

}
