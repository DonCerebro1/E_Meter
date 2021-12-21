package com.company.ui;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDeviceUI extends Main {

    private JPanel addDevicePanel;
    private JButton backButton;
    private JButton addButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public AddDeviceUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addButton.isEnabled()){
                    textField2.getText();
                    textField3.getText();

                }
            }
        });
    }

    public JPanel getAddDevicePanel() {
        return addDevicePanel;
    }
}
