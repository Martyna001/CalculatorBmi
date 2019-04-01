package pl.academy.code.CalculatorBmi.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorBmiServiceTest {

    private static CalculatorBmiService calculatorBmiService;
    @BeforeClass
    public static void start(){
        calculatorBmiService = new CalculatorBmiService();
    }
    @AfterClass
    public static void stop(){
        calculatorBmiService = null;
    }


    @Test
    public void calculationTest (){
        assertEquals(14.69, calculatorBmiService.sumBmi(45, 1.75),0.05);
        assertEquals(24.15, calculatorBmiService.sumBmi(69,1.69), 0.05);
        assertNotEquals(20.15, calculatorBmiService.sumBmi(69,1.69),0.05);

    }
}
