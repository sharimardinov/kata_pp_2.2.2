package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Mayota", 1984));
        carList.add(new Car("Honda", "Monda", 1991));
        carList.add(new Car("Ford", "Bord", 2008));
        carList.add(new Car("Chevrolet", "Kevrolet", 2014));
        carList.add(new Car("Nissan", "Lissan", 2022));
        return carList;
    }

    @Override
    public List<Car> addCars(int count) {
        List<Car> carList = createCarList();  // Используем метод для создания списка
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}