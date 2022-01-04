package com.company.ui;

import com.company.Data.List;
import com.company.DeviceList;
import com.company.HomeRooms;
import com.company.Main;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DeviceUI extends Main implements List {
    private JPanel devicePanel;
    private JButton backButton;

    public JTable table1;
    private JScrollPane sp;



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

        table1.setModel(tm);
        tm.addColumn("Zimmer");
        tm.addColumn("Name");
        tm.addColumn("Watt");
        tm.addColumn("Nutzungsdauer");

        tm.insertRow(0,new Object[]{"Wohnzimmer"} );
        tm.insertRow(0,new Object[]{"Küche"} );
        tm.insertRow(0,new Object[]{"Schlafzimmer"} );
        tm.insertRow(0,new Object[]{"Badezimmer"} );


    }
    
    public JPanel getDevicePanel() {
        return devicePanel;
    }



}
