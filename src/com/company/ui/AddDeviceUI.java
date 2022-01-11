package com.company.ui;

import com.company.Data.List;
import com.company.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


public class AddDeviceUI extends DeviceUI implements List {

    private JPanel addDevicePanel;
    private JButton backButton;
    private JButton addButton;
    private JTextField deviceNutzungTextfield;
    private JTextField deviceWattTextfield;
    private JTextField deviceNameTextfield;
    private JRadioButton radioButtonWhz;
    private JRadioButton schlafzimmerRadioButton;
    private JRadioButton kücheRadioButton;
    protected Vector<String> data = new Vector<>();


    public AddDeviceUI() {
        // so that only one button can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonWhz);
        group.add(schlafzimmerRadioButton);
        group.add(kücheRadioButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });

        addButton.addActionListener(e -> {
            //Add Device here.....
            data.addElement(deviceNameTextfield.getText());
            data.addElement(deviceWattTextfield.getText());
            data.addElement(deviceNutzungTextfield.getText());
            if(addButton.isEnabled() && radioButtonWhz.isSelected()){
                wTm.insertRow(0, data);
            }
            else {
                System.out.println("Error - Textfield is Empty");
            }
            if(addButton.isEnabled() && schlafzimmerRadioButton.isSelected()){
                sTm.insertRow(0,data);
            }else{
                System.out.println("Error - Textfield is Empty");
            }
            if(addButton.isEnabled() && kücheRadioButton.isSelected()){
                kTm.insertRow(0,data);
            }else{
                System.out.println("Error - Textfield is Empty");
            }
        });
    }
    public JPanel getAddDevicePanel() {
        return addDevicePanel;
    }
}
