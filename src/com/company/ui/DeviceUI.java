package com.company.ui;

import com.company.Data.List;
import com.company.Main;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeviceUI extends Main implements List {
    private JPanel devicePanel;
    private JButton backButton;
    public JTable tableLivingRoom;
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
        tableKitchen.setModel(kTm);
        tableBedroom.setModel(sTm);
        tableLivingRoom.setModel(wTm);

        //adds columns
        //Table for Kitchen
        kTm.addColumn("Name");
        kTm.addColumn("Watt");
        kTm.addColumn("Nutzungsdauer");

        //Table for bedroom
        sTm.addColumn("Name");
        sTm.addColumn("Watt");
        sTm.addColumn("Nutzungsdauer");

        //Table for living room
        wTm.addColumn("Name");
        wTm.addColumn("Watt");
        wTm.addColumn("Nutzungsdauer");

        //Maximum for Column and rows und can be created
        kTm.setColumnCount(3);
        kTm.setRowCount(5);

        sTm.setColumnCount(3);
        sTm.setRowCount(5);

        wTm.setColumnCount(3);
        wTm.setRowCount(5);
    }
    
    public JPanel getDevicePanel() {
        return devicePanel;
    }
}
