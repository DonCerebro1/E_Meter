package com.company.ui;

import com.company.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Wenn ein Land ausgeählt ist. Denn durchschnittspreis von diesem Land nehmen.
 * Wenn später Stadtwerke hinzugefügt werden können dann diese Preise mit dem
 * durchschnittspreis des Landes überchreiben.
 *
 * Mit Flag arbeiten hier!!!
 */

public class OptionsUI extends Main {
    private JPanel optionPanel;
    private JButton backButton;

    public OptionsUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });
    }

    public JPanel getOptionPanel() {
        return optionPanel;
    }
}
