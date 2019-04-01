package pl.academy.code.CalculatorBmi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.academy.code.CalculatorBmi.model.Underweight;

@Controller
public class UnderweightController {

    @RequestMapping("/underweight")
    public String createUnderweight (Model model){
        model.addAttribute("underweight", new Underweight());
        return "underweight";
    }
}
