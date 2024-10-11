package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> addCars(int count) {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Toyota", "Mayota", 1984));
            carList.add(new Car("Honda", "Monda", 1991));
            carList.add(new Car("Ford", "Bord", 2008));
            carList.add(new Car("Chevrolet", "Kevrolet", 2014));
            carList.add(new Car("Nissan", "Lissan", 2022));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
