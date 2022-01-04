package com.company.ui;

import com.company.Data.List;
import com.company.DeviceList;
import com.company.HomeRooms;
import com.company.Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddDeviceUI extends Main implements List {

    private JPanel addDevicePanel;
    private JButton backButton;
    private JButton addButton;
    private JTextField deviceNutzungTextfield;
    private JTextField deviceWattTextfield;
    private JTextField deviceNameTextfield;
    private JRadioButton radioButtonLamp;
    private JRadioButton radioButtonTv;
    private JRadioButton radioButtonWhz;
    private JRadioButton schlafzimmerRadioButton;
    private JRadioButton kücheRadioButton;
    private JRadioButton badezimmerRadioButton;

    public AddDeviceUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }


            }
        });
        /***
         * Aktuell verdoppeln sich Spalten und Zeilen und sind Editable
         * Inhalt vom Textfield geht aktuell nur maximal ein Textfield
         * und packt es auch nur in die erste Zeile und nicht weiter
         */
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add Device here.....
                if(addButton.isEnabled()){
                    //tm.insertRow(0,new Object[]{deviceNameTextfield.getText()});

                }

            }
        });


    }
    public JPanel getAddDevicePanel() {
        return addDevicePanel;
    }
}
