package ua.com.alevel;

import lombok.SneakyThrows;
import ua.com.alevel.entity.Car;
import ua.com.alevel.entity.CarModel;
import ua.com.alevel.service.CarService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

public class ProgramRun {

    private static final CarService carService = new CarService();

    public static void start() {
        System.out.println("Welcome to crud car");
        System.out.println("Please enter!");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (true) {
                System.out.println();
                navigation();
                caseLogic(reader);
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

    private static void navigation() {
        System.out.println("If you want create car, please enter 1");
        System.out.println("If you want update car, please enter 2");
        System.out.println("If you want delete car, please enter 3");
        System.out.println("If you want find car, please enter 4");
        System.out.println("If you want find all car, please enter 5");
        System.out.println("If you want exit, please enter 0");
    }

    @SneakyThrows
    private static void caseLogic(BufferedReader reader) {
        String line = reader.readLine();
        switch (line) {
            case "1" -> create(reader);
            case "2" -> update(reader);
            case "3" -> delete(reader);
            case "4" -> findById(reader);
            case "5" -> findAll();
            case "0" -> System.exit(0);
        }
    }

    private static void create(BufferedReader reader) throws IOException {
        System.out.println("please, enter car name:");
        String name = reader.readLine();
        System.out.println("please, enter car model:");
        String model = reader.readLine();
        Car car = new Car();
        car.setName(name);
        car.setModel(CarModel.valueOf(model.toUpperCase()));
        carService.create(car);
        System.out.println("car is created");
    }

    private static void update(BufferedReader reader) {}

    private static void delete(BufferedReader reader) {}

    private static void findById(BufferedReader reader) {}

    private static void findAll() {
        Collection<Car> cars = carService.findAll();
        for (Car car : cars) {
            System.out.println("car = " + car);
        }
    }
}
