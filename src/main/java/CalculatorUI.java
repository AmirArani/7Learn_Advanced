import javax.swing.*;

public class CalculatorUI {
    public static void main (String[] args){
        JFrame calculator = new JFrame("Calculator");

        JTextField results = new JTextField();
        results.setBounds(0,0,200, 50);
        results.setEnabled(false);

        JButton one = new JButton("1");
        one.setBounds(0, 50,50,50);
        JButton two = new JButton("2");
        two.setBounds(50, 50,50,50);
        JButton three = new JButton("3");
        three.setBounds(100, 50,50,50);
        JButton plus = new JButton("+");
        plus.setBounds(150, 50,50,50);

        JButton four = new JButton("4");
        four.setBounds(0, 100,50,50);
        JButton five = new JButton("5");
        five.setBounds(50, 100,50,50);
        JButton six = new JButton("6");
        six.setBounds(100, 100,50,50);
        JButton minus = new JButton("-");
        minus.setBounds(150, 100,50,50);

        JButton seven = new JButton("7");
        seven.setBounds(0, 150,50,50);
        JButton eight = new JButton("8");
        eight.setBounds(50, 150,50,50);
        JButton nine = new JButton("9");
        nine.setBounds(100, 150,50,50);
        JButton multipe = new JButton("x");
        multipe.setBounds(150, 150,50,50);

        JButton point = new JButton(".");
        point.setBounds(0, 200,50,50);
        JButton zero = new JButton("0");
        zero.setBounds(50, 200,50,50);
        JButton equal = new JButton("=");
        equal.setBounds(100, 200,50,50);
        JButton devision = new JButton("/");
        devision.setBounds(150, 200,50,50);


        calculator.add(results);
        calculator.add(one);
        calculator.add(two);
        calculator.add(three);
        calculator.add(plus);
        calculator.add(four);
        calculator.add(five);
        calculator.add(six);
        calculator.add(minus);
        calculator.add(seven);
        calculator.add(eight);
        calculator.add(nine);
        calculator.add(multipe);
        calculator.add(point);
        calculator.add(zero);
        calculator.add(equal);
        calculator.add(devision);

        calculator.setSize(600, 600);
        calculator.setLayout(null);
        calculator.setVisible(true);

    }
}
