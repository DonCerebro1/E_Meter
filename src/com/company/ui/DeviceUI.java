package com.company.ui;

import com.company.Data.List;
import com.company.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeviceUI extends Main implements List {
    private JPanel devicePanel;
    private JButton backButton;
    private JTable tableLivingRoom;
    private JScrollPane sp;
    private JTable tableKitchen;
    private JTable tableBedroom;

    public DeviceUI() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(backButton.isEnabled()){
                    createGUI();
                }
            }
        });
        createTable();
    }

    private void createTable(){
        //sets model for all JTables
        tableKitchen.setModel(tm);
        tableBedroom.setModel(tm);
        tableLivingRoom.setModel(tm);

        //adds columns
        tm.addColumn("Name");
        tm.addColumn("Watt");
        tm.addColumn("Nutzungsdauer");

        //Maximum for Column and rows und can be created
        tm.setColumnCount(3);
        tm.setRowCount(5);
    }
    
    public JPanel getDevicePanel() {
        return devicePanel;
    }
}
