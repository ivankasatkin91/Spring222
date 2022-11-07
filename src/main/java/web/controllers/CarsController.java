package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import web.services.CarsService;

@Controller
public class CarsController {

    private CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("cars")
    public String getAllCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count == null || count > 4) {
            model.addAttribute("autos", carsService.getCars());
        } else {
            model.addAttribute("autos", carsService.getSomeCars(count));
        }
        return "cars";
    }

}
