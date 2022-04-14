package calculator;

public class Calculator {

    public String add(final String num1, final String num2) {
        return String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2));
    }

    public String minus(final String num1, final String num2){
        return String.valueOf(Double.parseDouble(num1) - Double.parseDouble(num2));
    }

    public String multiple(final String num1, final String num2){
        return String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2));
    }

    public String devision(final String num1, final String num2){
        return String.valueOf(Double.parseDouble(num1) / Double.parseDouble(num2));
    }

}
