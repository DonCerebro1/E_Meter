package com.company.ui;

import javax.swing.*;


public class MainUI
{
    private JPanel rootPanel;
    private JButton optionsButton;
    private JButton addDevicesButton;
    private JButton statisticsButton;
    private JButton devicesButton;
    private JPanel secondPanel;
    private JPanel headerPanel;
    private JPanel firstPanel;
    private JTextField textField1;
    private JTextField textField2;


    public JPanel getRootPanel(){return rootPanel;}
    public JPanel getFirstPanel(){return firstPanel;}
    public JPanel getSecondPanel(){return secondPanel;}

    public JButton getOptionsButton() {
        return optionsButton;
    }

    public JButton getAddDevicesButton() {
        return addDevicesButton;
    }

    public JButton getStatisticsButton() {
        return statisticsButton;
    }

    public JButton getDevicesButton() {
        return devicesButton;
    }
}

