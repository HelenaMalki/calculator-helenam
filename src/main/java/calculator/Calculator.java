package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Final project Calculator2
 *
 * Main class that setups and start the application
 *
 * @author  Helena Malki
 * @version 1.0
 */
public class Calculator extends JFrame {
    private CalculatorBasicOperations basicOperations = new CalculatorBasicOperations();
    private CalculatorAdvancedOperations advancedOperations = new CalculatorAdvancedOperations();

    private String firstInputNumber = "";
    private String secondInputNumber = "";
    private String mathCommand = "";
    private String outputText = "";

    private JLabel outputField;
    private JPanel numberPanel;
    private JPanel basicOperationPanel;
    private JPanel advancedOperationPanel;

    /**
     * Calculator2 constructor
     */
    public Calculator() {
        initUI();
    }

    /**
     * Updates the outputField
     */
    public void updateOutputField() {
        outputField.setText(outputText);
    }

    /**
     * Setups the number panel where all numbers, C, = and decimal lives.
     */
    public void setUpNumberPanel() {
        numberPanel = new JPanel();
        numberPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        numberPanel.setLayout(new GridLayout(4, 3, 5, 5));

        String[] buttons = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};

        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(numberListener());
            numberPanel.add(jButton);
        }

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearCalculator();
                outputField.setText(" ");
            }
        });
        numberPanel.add(clearButton);

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAction();
            }
        });

        numberPanel.add(equalButton);
    }

    /**
     * Method that calculates the values
     */
    private void calculateAction() {
        double a = firstInputNumber.isEmpty() ? 0 : Double.parseDouble(firstInputNumber);
        double b = secondInputNumber.isEmpty() ? 0 : Double.parseDouble(secondInputNumber);
        double result = 0;

        switch (mathCommand) {
            case "+":
                result = basicOperations.addition(a, b);
                break;
            case "-":
                result = basicOperations.subtraction(a, b);
                break;
            case "/":
                result = basicOperations.division(a, b);
                break;
            case "*":
                result = basicOperations.multiply(a, b);
                break;
            case "abs":
                result = advancedOperations.abs(a);
                break;
            case "cos":
                result = advancedOperations.cos(a);
                break;
            case "sqrt":
                result = advancedOperations.sqrt(a);
                break;
            case "cbrt":
                result = advancedOperations.cbrt(a);
                break;
            case "tan":
                result = advancedOperations.tan(a);
                break;
            case "sin":
                result = advancedOperations.sin(a);
                break;
        }

        outputText = String.valueOf(result);
        updateOutputField();
        clearCalculator();
    }

    /**
     * Clears all values for the calculator
     */
    private void clearCalculator() {
        firstInputNumber = "";
        secondInputNumber = "";
        mathCommand = "";
        outputText = "";
    }

    /**
     * Setups the basic operation panel that includes, +, - , / and *
     */
    public void setUpBasicOperationPanel() {

        basicOperationPanel = new JPanel();
        basicOperationPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        basicOperationPanel.setSize(100, 200);
        basicOperationPanel.setLayout(new GridLayout(4, 1, 5, 5));

        String[] buttons = {"+", "-", "/", "*"};

        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(operationListener());
            basicOperationPanel.add(jButton);
        }
    }

    /**
     * Setups the output field, this field will show the input and result.
     */
    public void setUpOutputNumberFieldPanel() {
        outputField = new JLabel(" ");
    }

    /**
     * Setups the advance operation panel that includes abs, cos, sqrt, cbrt, tan and sin
     */
    public void setUpAdvancedOperationPanel() {
        advancedOperationPanel = new JPanel();
        advancedOperationPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        advancedOperationPanel.setSize(100, 200);
        advancedOperationPanel.setLayout(new GridLayout(6, 1, 5, 5));

        String[] buttons = {"abs", "cos", "sqrt", "cbrt", "tan", "sin"};
        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(operationListener());
            advancedOperationPanel.add(jButton);
        }
    }

    /**
     * Initiates all the panels
     */
    private void initUI() {
        setUpOutputNumberFieldPanel();
        setUpNumberPanel();
        setUpBasicOperationPanel();
        setUpAdvancedOperationPanel();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(outputField, BorderLayout.NORTH);

        panel.add(advancedOperationPanel, BorderLayout.WEST);
        panel.add(numberPanel, BorderLayout.CENTER);
        panel.add(basicOperationPanel, BorderLayout.EAST);

        add(panel);

        setTitle("Calculator");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * Method that will handle all operation actions
     *
     * @return ActionListener
     */
    public ActionListener operationListener() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                //Dont allow to add more operation if there is two numbers.
                if (secondInputNumber.isEmpty()) {
                    outputText += command;
                    if (command.equals("-") &&
                            firstInputNumber.isEmpty()) {
                        firstInputNumber = command;
                    } else {
                        mathCommand = command;
                    }
                    updateOutputField();
                }
            }
        };
    }

    /**
     * Method that will handle all number input actions
     *
     * @return ActionListener
     */
    public ActionListener numberListener() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = e.getActionCommand();
                outputText += value;
                if (mathCommand.isEmpty()) {
                    firstInputNumber += value;
                } else {
                    secondInputNumber += value;
                }
                updateOutputField();
            }
        };
    }

    /**
     * Main method
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.pack();
        calculator.setLocationRelativeTo(null);
        calculator.setVisible(true);
    }
}
