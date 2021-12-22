package com.company.ui;

import com.company.Data.List;
import com.company.DeviceList;
import com.company.HomeRooms;
import com.company.Main;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DeviceUI extends Main implements List {
    private JPanel devicePanel;
    private JButton backButton;
    private JSplitPane splitPane;
    JLabel label = new JLabel();


    public DeviceUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });

        /**************Liste der Geräte************
         * Label geht nicht!!!!**
         * Bug wenn Gerät hinzugefügt wird verdoppeln sich teilweise die Räume auf
         * der Linken seite ------> liegt am Textfield "WOhnbereich" im AddDeviceUI
         * wenn die liste geöffnet wird und wieder zurück in Menu dann wieder auf die
         * Liste verdoppeln sich die Einträge*/

        roomList.setModel(roomModel);
        //roomModel.addElement(new HomeRooms("Badezimmer"));
        //roomModel.addElement(new HomeRooms("Küche"));
        //roomModel.addElement(new HomeRooms("Schlafzimmer"));
        //roomModel.addElement(new HomeRooms("Wohnzimmer"));


        list.setModel(model);
        splitPane.setRightComponent(new JScrollPane(list));
        splitPane.setLeftComponent(new JScrollPane(roomList));
        //devicePanel.add(label);

        list.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                DeviceList dl = list.getSelectedValue();
                //label.setText("Name: " + dl.getName() + "Watt: " + dl.getWatt() + "Nutzungdauer: " + dl.getUsageTime());

            }
        });
    }

    public JPanel getDevicePanel() {
        return devicePanel;
    }



}
