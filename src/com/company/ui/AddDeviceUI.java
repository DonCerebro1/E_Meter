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
         * Darf nur ein Raum gleichzeitig ausgewählt werden
         * Darf nur jeweils ein Zimmer vom gleichen Typ erstellt werden!!
         */
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addButton.isEnabled()){
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }else if(addButton.isEnabled() && schlafzimmerRadioButton.isEnabled()){
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }else if(addButton.isEnabled() && kücheRadioButton.isEnabled()){
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }else if(addButton.isEnabled() && badezimmerRadioButton.isEnabled()){
                    model.addElement(new DeviceList(deviceNameTextfield.getText(),deviceWattTextfield.getText(),deviceNutzungTextfield.getText()));
                }
            }
        });
        radioButtonWhz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radioButtonWhz.isEnabled()){
                    roomModel.addElement(new HomeRooms("Wohnzimmer"));
                }
            }
        });
        schlafzimmerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(schlafzimmerRadioButton.isEnabled()){
                    roomModel.addElement(new HomeRooms("Schlafzimmer"));
                }
            }
        });
        kücheRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(kücheRadioButton.isEnabled()){
                    roomModel.addElement(new HomeRooms("Küche"));
                }
            }
        });
        badezimmerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(badezimmerRadioButton.isEnabled()){
                    roomModel.addElement(new HomeRooms("Badezimmer"));
                }
            }
        });
    }
    public JPanel getAddDevicePanel() {
        return addDevicePanel;
    }
}
