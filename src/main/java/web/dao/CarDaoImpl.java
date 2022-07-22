package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1,"BMW", "X5"));
        cars.add(new Car(2,"Citroen", "C5"));
        cars.add(new Car(3,"BMW", "M6"));
        cars.add(new Car(4,"Fiat", "Ulisse"));
        cars.add(new Car(5,"Ford", "musculcar"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCountCar(int quantity) {
        return cars.stream().limit(quantity).toList();
    }
}
