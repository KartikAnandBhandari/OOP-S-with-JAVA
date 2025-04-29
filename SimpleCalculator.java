import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String currentInput = "";
    private double firstOperand = 0;
    private String operator = "";
    private boolean operatorClicked = false;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        // Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String b : buttons) {
            JButton button = new JButton(b);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            if (operatorClicked) {
                currentInput = cmd;
                operatorClicked = false;
            } else {
                currentInput += cmd;
            }
            display.setText(currentInput);
        } else if (cmd.matches("[+\\-*/]")) {
            if (!currentInput.isEmpty()) {
                firstOperand = Double.parseDouble(currentInput);
                operator = cmd;
                operatorClicked = true;
            }
        } else if (cmd.equals("=")) {
            if (!currentInput.isEmpty() && !operator.isEmpty()) {
                double secondOperand = Double.parseDouble(currentInput);
                double result = 0;

                switch (operator) {
                    case "+": result = firstOperand + secondOperand; break;
                    case "-": result = firstOperand - secondOperand; break;
                    case "*": result = firstOperand * secondOperand; break;
                    case "/":
                        if (secondOperand == 0) {
                            display.setText("Error: /0");
                            currentInput = "";
                            operator = "";
                            return;
                        }
                        result = firstOperand / secondOperand;
                        break;
                }

                String resultStr = (result == (int) result) ? String.valueOf((int) result) : String.valueOf(result);
                display.setText(resultStr);
                currentInput = resultStr;
                operator = "";
                operatorClicked = false;
            }
        } else if (cmd.equals("C")) {
            currentInput = "";
            firstOperand = 0;
            operator = "";
            operatorClicked = false;
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }
}