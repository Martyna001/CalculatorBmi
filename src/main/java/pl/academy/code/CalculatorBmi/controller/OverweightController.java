package pl.academy.code.CalculatorBmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.academy.code.CalculatorBmi.model.Overweight;


@Controller
public class OverweightController {

    @RequestMapping("/overweight")
    public String createOverweight(Model model) {
        model.addAttribute("overweight", new Overweight());
        return "overweight";
    }
}
