import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class EmployeeApp {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/company_db";
    private static final String JDBC_USERNAME = "root"; // Your MySQL username
    private static final String JDBC_PASSWORD = "your_password"; // Your MySQL password

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Management");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField idField = new JTextField(10);
        JTextField nameField = new JTextField(10);
        JTextField departmentField = new JTextField(10);
        JTextField salaryField = new JTextField(10);

        JButton insertButton = new JButton("Insert Employee");

        // Table to display employee data
        JTable employeeTable = new JTable();
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Department", "Salary"}, 0);
        employeeTable.setModel(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(employeeTable);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String department = departmentField.getText();
                String salary = salaryField.getText();

                try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
                    String sql = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                        stmt.setString(1, id);
                        stmt.setString(2, name);
                        stmt.setString(3, department);
                        stmt.setString(4, salary);
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(frame, "Employee inserted successfully.");
                        retrieveData(tableModel); // Call retrieveData() after insertion
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Layout for input fields and insert button
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Department:"));
        inputPanel.add(departmentField);
        inputPanel.add(new JLabel("Salary:"));
        inputPanel.add(salaryField);
        inputPanel.add(insertButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(tableScrollPane, BorderLayout.CENTER);

        frame.setVisible(true);

        retrieveData(tableModel); // Initially retrieve and display data
    }

    // This method is now outside of main()
    public static void retrieveData(DefaultTableModel tableModel) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String query = "SELECT * FROM employees";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {
                tableModel.setRowCount(0);
                while (rs.next()) {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String department = rs.getString("department");
                    String salary = rs.getString("salary");
                    tableModel.addRow(new Object[]{id, name, department, salary});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
