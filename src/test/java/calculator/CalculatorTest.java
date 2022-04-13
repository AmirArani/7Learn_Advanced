package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Jam_Konad(){
        Calculator calculator = new Calculator();
        String result = calculator.add("5.3", "-2");
        assertEquals("3.3", result);
    }

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Tafriq_Konad(){
        Calculator calculator = new Calculator();
        String result = calculator.minus("8", "4.0");
        assertEquals("4.0", result);
    }

    @Test
    void Bayad_Do_Adad_Ra_Ba_Ham_Zarb_Konad(){
        Calculator calculator = new Calculator();
        String result = calculator.multiple("2", "3");
        assertEquals("6.0", result);
    }

    @Test
    void Bayad_Do_Adad_Ra_Be_Ham_Taqsim_Konad(){
        Calculator calculator = new Calculator();
        String result = calculator.devision("10", "2");
        assertEquals("5.0", result);
    }


}
