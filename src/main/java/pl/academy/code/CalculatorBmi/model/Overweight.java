package pl.academy.code.CalculatorBmi.model;

public class Overweight {
    private String descriptionOverweight;

    public Overweight(){};

    public Overweight(String descriptionOverweight) {
        this.descriptionOverweight = descriptionOverweight;
    }

    public String getDescriptionOverweight() {
        return descriptionOverweight;
    }

    public void setDescriptionOverweight(String descriptionOverweight) {
        this.descriptionOverweight = descriptionOverweight;
    }
}
