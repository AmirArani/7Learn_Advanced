package calculator;

import javax.swing.*;

public class CalculatorUI {

    private static JFrame calculatorFrame;
    private static JTextField jTextField;
    private static String lastResult;
    private static int op = 0;
    private static boolean isResultShown;

    public static final int SIZE = 100;

    public static void main (String[] args){
        calculatorFrame = new JFrame("Calculator");

        calculatorFrame.setSize(600, 600);
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(true);

        initUiElements();
    }

    private static void initUiElements(){
        jTextField = new JTextField();
        jTextField.setBounds(0,0,SIZE*3, SIZE);
        jTextField.setEditable(false);
        calculatorFrame.add(jTextField);

        JButton one = getNumButton("1", 0, SIZE);
        JButton two = getNumButton("2", SIZE, SIZE);
        JButton three = getNumButton("3", SIZE*2, SIZE);
        JButton four = getNumButton("4", 0  , SIZE*2);
        JButton five = getNumButton("5", SIZE , SIZE*2);
        JButton six = getNumButton("6", SIZE*2, SIZE*2);
        JButton seven = getNumButton("7", 0  , SIZE*3);
        JButton eight = getNumButton("8", SIZE , SIZE*3);
        JButton nine = getNumButton("9", SIZE*2, SIZE*3);
        JButton zero = getNumButton("0", SIZE , SIZE*4);
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

        JButton plus = getOpButton("+", SIZE, 1 );
        JButton minus = getOpButton("-", SIZE*2, 2 );
        JButton multipe = getOpButton("x", SIZE*3, 3 );
        JButton devision = getOpButton("/", SIZE*4, 4 );
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
        button.setBounds(x, y,SIZE,SIZE);
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
        button.setBounds(SIZE*3, y,SIZE,SIZE);
        button.addActionListener(e -> {
            lastResult = jTextField.getText();
            jTextField.setText("");
            op = ops;
        });
        return button;
    }

    private static JButton initEqualBtn() {
        JButton equal = new JButton("=");
        equal.setBounds(SIZE*2, SIZE*4,SIZE,SIZE);
        equal.addActionListener(e -> {

            final Calculator calculator = new Calculator();
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
        point.setBounds(0, SIZE*4,SIZE,SIZE);
        point.addActionListener(e -> {
            if (!jTextField.getText().isEmpty() && !jTextField.getText().contains(".")){
                jTextField.setText(jTextField.getText()+".");
            }
        });
        return point;
    }
    private static JButton initCancelBtn() {
        JButton cancel = new JButton("C");
        cancel.setBounds(SIZE*3, 0,SIZE,SIZE);
        cancel.addActionListener(e -> {
            jTextField.setText("");
            op=0;
        });
        return cancel;
    }
}