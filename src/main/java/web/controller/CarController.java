package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        List<Car> carList = carServiceImpl.addCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }

}