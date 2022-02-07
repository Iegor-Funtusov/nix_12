package ua.com.alevel.db;

import ua.com.alevel.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarListBD implements CarDB {

    private final List<Car> cars = new ArrayList<>();

    public CarListBD() {
        System.out.println("CarListBD.CarListBD");
    }

    public void create(Car car) {
        car.setId(generateId());
        cars.add(car);
    }

    public void update(Car car) {
        Car current = findById(car.getId());
        current.setName(car.getName());
        current.setModel(car.getModel());
    }

    public void delete(String id) {
        cars.removeIf(car -> car.getId().equals(id));
    }

    public Car findById(String id) {
        return cars
                .stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .get();
    }

    public List<Car> findAll() {
        return cars;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        if (cars.stream().anyMatch(car -> car.getId().equals(id))) {
            return generateId();
        }
        return id;
    }
}
