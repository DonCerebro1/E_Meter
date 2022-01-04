package com.company.Data;

import com.company.DeviceList;
import com.company.HomeRooms;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public interface List {
    ArrayList<String> device = new ArrayList<>();
    ArrayList<String> deviceContainer = new ArrayList<>();
    ArrayList<String> deviceLamp = new ArrayList<>();
    ArrayList<String> deviceTv = new ArrayList<>();
    JList<DeviceList> list = new JList<>();
    DefaultListModel<DeviceList> model = new DefaultListModel<>();
    JList<HomeRooms> roomList = new JList<>();
    DefaultListModel<HomeRooms> roomModel = new DefaultListModel<>();
    DefaultTableModel tm = new DefaultTableModel();



}
