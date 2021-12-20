package com.company.ui;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatsUI extends Main {
    private JPanel statsPanel;
    private JButton backButton;

    public StatsUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });
    }

    public JPanel getStatsPanel() {
        return statsPanel;
    }
}
