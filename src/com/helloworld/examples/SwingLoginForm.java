package com.helloworld.examples;

import com.helloworld.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingLoginForm implements ActionListener {

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JLabel message;
    private static JTextField userText;
    private static JPasswordField passwordText;

    // User
    private String username = "janedoe";
    private String password = "password";

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 40, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 40, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 70, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 70, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(100, 120, 165, 25);
        button.addActionListener(new SwingLoginForm());
        panel.add(button);

        message = new JLabel("");
        message.setBounds(100, 10, 300, 25);
        panel.add(message);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = String.valueOf(passwordText.getPassword());

        if (username.equals(this.username) && password.equals(this.password) ) {
            message.setText("Successful login");
        } else {
            message.setText("Failed to login");
        }
    }
}
