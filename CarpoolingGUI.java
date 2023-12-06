import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarpoolingGUI {
    private JFrame frame;

    // User Registration components
    private JTextField usernameField;
    private JButton registerButton;

    public CarpoolingGUI() {
        frame = new JFrame("Carpooling System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Initialize User Registration components
        initializeUserRegistration();

        // Set layout and add components
        frame.setLayout(new GridLayout(2, 1));
        frame.add(usernameField);
        frame.add(registerButton);

        frame.setVisible(true);
    }

    private void initializeUserRegistration() {
        usernameField = new JTextField();
        registerButton = new JButton("Register");

        // Register button action listener
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle user registration logic here
                String username = usernameField.getText();
                // Perform registration actions
                JOptionPane.showMessageDialog(frame, "User " + username + " registered successfully!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarpoolingGUI();
            }
        });
    }
}
