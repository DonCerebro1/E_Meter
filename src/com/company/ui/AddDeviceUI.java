package com.company.ui;

import com.company.Data.List;
import com.company.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AddDeviceUI extends Main implements List {

    private JPanel addDevicePanel;
    private JButton backButton;
    private JButton addButton;
    private JTextField deviceNutzungTextfield;
    private JTextField deviceWattTextfield;
    private JTextField deviceNameTextfield;
    private JRadioButton radioButtonWhz;
    private JRadioButton schlafzimmerRadioButton;
    private JRadioButton kücheRadioButton;

    public AddDeviceUI() {
        //damit nur ein Button gleichzeitig ausgewählt werden kann
        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonWhz);
        group.add(schlafzimmerRadioButton);
        group.add(kücheRadioButton);

        //Gets String from Textfield and brings it up in JTables
        String[][] data={{deviceNameTextfield.getText()},{deviceWattTextfield.getText()},{deviceNutzungTextfield.getText()}};

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });

        /***
         * Inhalt vom Textfield geht aktuell nur maximal ein Textfield
         * und packt es auch nur in die erste Zeile und nicht weiter
         */
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add Device here.....
                if(addButton.isEnabled()){
                    tm.insertRow(0,data);
                }
            }
        });
    }

    public JPanel getAddDevicePanel() {
        return addDevicePanel;
    }
}
