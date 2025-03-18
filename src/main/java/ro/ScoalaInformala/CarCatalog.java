package ro.ScoalaInformala;

import java.util.ArrayList;
import java.util.List;

public class CarCatalog {
    private final List<Car> cars;

    public CarCatalog() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
