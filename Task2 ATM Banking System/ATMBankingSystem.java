package com.codingsamurai.SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMBankingSystem extends JFrame {
    private double balance;
    private JLabel balanceLabel;
    private JTextField amountField;
    
    public ATMBankingSystem() {
        this.balance = 1000.0; // Initial balance
        
        setTitle("ATM Banking System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));
        
        balanceLabel = new JLabel("Balance: $" + balance, SwingConstants.CENTER);
        add(balanceLabel);
        
        amountField = new JTextField();
        add(amountField);
        
        JButton checkBalanceButton = new JButton("Check Balance");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton exitButton = new JButton("Exit");
        
        add(checkBalanceButton);
        add(depositButton);
        add(withdrawButton);
        add(exitButton);
        
        checkBalanceButton.addActionListener(e -> checkBalance());
        depositButton.addActionListener(e -> deposit());
        withdrawButton.addActionListener(e -> withdraw());
        exitButton.addActionListener(e -> System.exit(0));
        
        setVisible(true);
    }
    
    private void checkBalance() {
        JOptionPane.showMessageDialog(this, "Your balance is: $" + balance);
    }
    
    private void deposit() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0) {
                balance += amount;
                balanceLabel.setText("Balance: $" + balance);
                JOptionPane.showMessageDialog(this, "Deposited: $" + amount);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid deposit amount.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
        }
    }
    
    private void withdraw() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                balanceLabel.setText("Balance: $" + balance);
                JOptionPane.showMessageDialog(this, "Withdrawn: $" + amount);
            } else if (amount > balance) {
                JOptionPane.showMessageDialog(this, "Insufficient balance.");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid withdrawal amount.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount.");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ATMBankingSystem::new);
    }
}
