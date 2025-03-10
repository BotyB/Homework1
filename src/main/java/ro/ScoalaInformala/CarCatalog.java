package ro.ScoalaInformala;

import java.util.ArrayList;
import java.util.List;

public class CarCatalog {
    private final List<Car> cars = new ArrayList<>();
    public void addCar(Car car) {
        cars.add(car);
    }
    public Car getCar(String chassisNumber) {
        for (Car car : cars) {
            if (car.getChassisNumber().equals(chassisNumber)) {
                return car;
            }
        }
        return null;
    }
}
