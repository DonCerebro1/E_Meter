package com.company.ui;

import com.company.Data.List;
import com.company.DeviceList;
import com.company.HomeRooms;
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
         * Erstellt nur das Wohnzimmer egal welcher Button geklickt wurde
         * Wenn es klappt brauchen wir eine Funktion die verhindert das der
         * selbe Raum nochmal erstellt wird.
         */
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addButton.isEnabled() && radioButtonWhz.isEnabled()){
                    roomModel.addElement(new HomeRooms("Wohnzimmer"));
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }else if(addButton.isEnabled() && schlafzimmerRadioButton.isEnabled()){
                    roomModel.addElement(new HomeRooms("Schlafzimmer"));
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }else if(addButton.isEnabled() && kücheRadioButton.isEnabled()){
                    roomModel.addElement(new HomeRooms("Küche"));
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }else if(addButton.isEnabled() && badezimmerRadioButton.isEnabled()){
                    roomModel.addElement(new HomeRooms("Badezimmer"));
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }
            }
        });
    }

    public JPanel getAddDevicePanel() {
        return addDevicePanel;
    }
}
