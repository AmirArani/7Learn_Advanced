package calculator;

import javax.swing.*;

public class CalculatorUI {

    private static JFrame calculatorFrame;
    private static JTextField jTextField;
    private static String lastResult;
    private static int op = 0;
    private static boolean isResultShown;

    public static void main (String[] args){
        calculatorFrame = new JFrame("Calculator");

        calculatorFrame.setSize(250, 300);
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(true);

        initUiElements();
    }

    private static void initUiElements(){
        jTextField = new JTextField();
        jTextField.setBounds(0,0,150, 50);
        jTextField.setEditable(false);
        calculatorFrame.add(jTextField);

        JButton one = getNumButton("1", 0  , 50 );
        JButton two = getNumButton("2", 50 , 50 );
        JButton three = getNumButton("3", 100, 50 );
        JButton four = getNumButton("4", 0  , 100);
        JButton five = getNumButton("5", 50 , 100);
        JButton six = getNumButton("6", 100, 100);
        JButton seven = getNumButton("7", 0  , 150);
        JButton eight = getNumButton("8", 50 , 150);
        JButton nine = getNumButton("9", 100, 150);
        JButton zero = getNumButton("0", 50 , 200);
        calculatorFrame.add(one);
        calculatorFrame.add(two);
        calculatorFrame.add(three);
        calculatorFrame.add(four);
        calculatorFrame.add(five);
        calculatorFrame.add(six);
        calculatorFrame.add(seven);
        calculatorFrame.add(eight);
        calculatorFrame.add(nine);
        calculatorFrame.add(zero);

        JButton plus = getOpButton("+", 50, 1 );
        JButton minus = getOpButton("-", 100, 2 );
        JButton multipe = getOpButton("x", 150, 3 );
        JButton devision = getOpButton("/", 200, 4 );
        calculatorFrame.add(plus);
        calculatorFrame.add(minus);
        calculatorFrame.add(multipe);
        calculatorFrame.add(devision);

        JButton cancel = initCancelBtn();
        JButton point = initPointsBtn();
        JButton equal = initEqualBtn();
        calculatorFrame.add(cancel);
        calculatorFrame.add(point);
        calculatorFrame.add(equal);
    }

    private static JButton getNumButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.setBounds(x, y,50,50);
        button.addActionListener(event -> {
            if (isResultShown){
                jTextField.setText("");
                isResultShown = false;
            }
            jTextField.setText(jTextField.getText() + button.getText());
        });
        return button;
    }

    private static JButton getOpButton(String label, int y, int ops){
        JButton button = new JButton(label);
        button.setBounds(150, y,50,50);
        button.addActionListener(e -> {
            lastResult = jTextField.getText();
            jTextField.setText("");
            op = ops;
        });
        return button;
    }

    private static JButton initEqualBtn() {
        JButton equal = new JButton("=");
        equal.setBounds(100, 200,50,50);
        equal.addActionListener(e -> {

            Calculator calculator = new Calculator();
            String result = "";

            if (!jTextField.getText().isEmpty() && !lastResult.isEmpty()){
                switch (op){
                    case 0: break;
                    case 1: result = calculator.add(lastResult, jTextField.getText()); break;
                    case 2: result = calculator.minus(lastResult, jTextField.getText()); break;
                    case 3: result = calculator.multiple(lastResult, jTextField.getText()); break;
                    case 4: result = calculator.devision(lastResult, jTextField.getText()); break;
                }
                jTextField.setText(result);
                isResultShown = true;
            }
        });
        return equal;
    }
    private static JButton initPointsBtn() {
        JButton point = new JButton(".");
        point.setBounds(0, 200,50,50);
        point.addActionListener(e -> {
            if (!jTextField.getText().isEmpty() && !jTextField.getText().contains(".")){
                jTextField.setText(jTextField.getText()+".");
            }
        });
        return point;
    }
    private static JButton initCancelBtn() {
        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0,50,50);
        cancel.addActionListener(e -> {
            jTextField.setText("");
            op=0;
        });
        return cancel;
    }
}