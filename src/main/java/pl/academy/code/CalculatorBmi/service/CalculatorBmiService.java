package pl.academy.code.CalculatorBmi.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorBmiService {

    public double sumBmi(double bodyweight, double height) {
        return bodyweight / (height * height);
    }
}
