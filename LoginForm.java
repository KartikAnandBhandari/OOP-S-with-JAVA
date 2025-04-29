 import javax.swing.*;

public class LoginForm extends JFrame {
    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 10, 90, 35);
        add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 10, 90, 25);
        add(userText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 40, 80, 25);
        add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 40, 160, 25);
        add(passText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 70, 80, 25);
        add(loginButton);

        JLabel statusLabel = new JLabel("Label");
        statusLabel.setBounds(10, 100, 250, 25);
        add(statusLabel);

        loginButton.addActionListener(e -> {
            String user = userText.getText();
            String pass = new String(passText.getPassword());
            if (user.equals("admin") && pass.equals("password")) {
                statusLabel.setText("Login successful!");
            } else {
                statusLabel.setText("Invalid username or password.");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
} 
