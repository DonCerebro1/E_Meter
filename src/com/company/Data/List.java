package com.company.Data;

import com.company.DeviceList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public interface List {
    JList<DeviceList> list = new JList<>();
    DefaultListModel<DeviceList> model = new DefaultListModel<>();

    //Makes JTable rows and column non Editable
    DefaultTableModel tm = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
}
