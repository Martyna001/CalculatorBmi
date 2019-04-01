package pl.academy.code.CalculatorBmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.academy.code.CalculatorBmi.model.Obesity;


@Controller
public class ObesityController {

    @RequestMapping("/obesity")
    public String createObesity(Model model) {
        model.addAttribute("obesity", new Obesity());
        return "obesity";
    }


}
