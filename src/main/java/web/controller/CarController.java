package web.controller;

import Service.ServiceCarList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count"
            , required = false) Integer integer,Model model ){

        ServiceCarList serviceCarList = new ServiceCarList();
        model.addAttribute("carsList",serviceCarList.show(integer));

        return "cars";
    }

}
