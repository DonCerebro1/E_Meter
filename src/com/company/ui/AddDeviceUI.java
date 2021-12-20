package com.company.ui;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDeviceUI extends Main {

    private JPanel addDevicePanel;
    private JButton backButton;

    public AddDeviceUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });
    }

    public JPanel getAddDevicePanel() {
        return addDevicePanel;
    }
}
