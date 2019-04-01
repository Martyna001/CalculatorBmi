package pl.academy.code.CalculatorBmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.academy.code.CalculatorBmi.model.CorrectWeight;


@Controller
public class CorrectWeightController {


        @RequestMapping("/correctweight")
        public String createCorrectWeight(Model model) {
            model.addAttribute("correctweight", new CorrectWeight());
            return "correctweight";
        }


    }
