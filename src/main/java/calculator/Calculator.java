package calculator;

public class Calculator {

    public String add(String num1, String num2) {
        return String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2));
    }

    public String minus(String num1, String num2){
        return String.valueOf(Double.parseDouble(num1) - Double.parseDouble(num2));
    }

    public String multiple(String num1, String num2){
        return String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2));
    }

    public String devision(String num1, String num2){
        return String.valueOf(Double.parseDouble(num1) / Double.parseDouble(num2));
    }

}
