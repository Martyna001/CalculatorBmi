package pl.academy.code.CalculatorBmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.academy.code.CalculatorBmi.model.CalculatorBmi;
import pl.academy.code.CalculatorBmi.service.CalculatorBmiService;

import javax.validation.Valid;

@Controller
public class CalculatorBmiController {

    @Autowired
    CalculatorBmiService calculatorBmiService;

    @RequestMapping("/CalculatorBmi")
    public String createCalculatorBmi(Model model) {
        model.addAttribute("calculator", new CalculatorBmi());
        return "CalculatorBMI";
    }

    @RequestMapping(path = "/CalculatorBmi", method = RequestMethod.POST)
    public String calculationBmi(@Valid @ModelAttribute("calculator") CalculatorBmi calculatorBmi, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "CalculatorBMI";

        }
        double result = calculatorBmiService.sumBmi(calculatorBmi.getBodyweight(), calculatorBmi.getHeight());
        redirectAttributes.addFlashAttribute("Wynik", result);
        return "redirect:/CalculatorBmi";

    }
}
