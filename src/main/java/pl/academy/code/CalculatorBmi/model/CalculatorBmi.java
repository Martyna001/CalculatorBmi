package pl.academy.code.CalculatorBmi.model;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

public class CalculatorBmi {

    @NotNull(message = "Pole nie może być puste!")
    @Range(min = 20, max = 300, message = "Masa ciała musi wynosić od 20 do 300 kg")
    private double bodyweight;
    @NotNull(message = "Polse nie może być puste!")
    private double height;

    public CalculatorBmi() {
    }

    public CalculatorBmi(double bodyweight, double height) {
        this.bodyweight = bodyweight;
        this.height = height;
    }

    public double getBodyweight() {
        return bodyweight;
    }

    public void setBodyweight(double bodyweight) {
        this.bodyweight = bodyweight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
