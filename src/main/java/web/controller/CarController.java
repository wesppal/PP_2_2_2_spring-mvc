package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carService.getAllCars());
        } else {
            model.addAttribute("cars", carService.getCountCar(count));
        }
        return "cars";
    }
}
