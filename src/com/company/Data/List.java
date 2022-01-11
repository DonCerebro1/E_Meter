package com.company.Data;

import javax.swing.table.DefaultTableModel;

public interface List {
    //Makes JTable rows and column non Editable
    DefaultTableModel wTm = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
    DefaultTableModel kTm = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
    DefaultTableModel sTm = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
}
