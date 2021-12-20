package com.company.ui;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeviceUI extends Main {
    private JPanel devicePanel;
    private JButton backButton;

    public DeviceUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });
    }

    public JPanel getDevicePanel() {
        return devicePanel;
    }
}
