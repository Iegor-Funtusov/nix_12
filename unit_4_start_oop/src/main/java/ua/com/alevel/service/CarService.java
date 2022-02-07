package ua.com.alevel.service;

import ua.com.alevel.config.DBConfig;
import ua.com.alevel.db.CarDB;
import ua.com.alevel.entity.Car;

import java.util.Collection;

public class CarService {

    private CarDB carBD = DBConfig.getInstance().getCarDb();

    public void create(Car car) {
        carBD.create(car);
    }

    public void update(Car car) {
        carBD.update(car);
    }

    public void delete(String id) {
        carBD.delete(id);
    }

    public Car findById(String id) {
        return carBD.findById(id);
    }

    public Collection<Car> findAll() {
        return carBD.findAll();
    }
}
