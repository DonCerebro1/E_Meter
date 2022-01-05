package com.company.ui;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import com.company.functions.KwHfunction;


public class MainUI extends KwHfunction
{

    private JPanel rootPanel;
    private JButton optionsButton;
    private JButton addDevicesButton;
    private JButton statisticsButton;
    private JButton devicesButton;
    private JPanel secondPanel;
    private JPanel headerPanel;
    private JPanel firstPanel;
    private JTextField kWhTextField;
    private JTextField currencyTextField;
    private JLabel versionLabel;
    private Calendar calendar;
    private SimpleDateFormat timeFormat;
    private String time;


    public MainUI() {
        kWhTextField.setText(String.valueOf(consumption()));
        currencyTextField.setText(String.valueOf(euPrices()));

        //Disables Border for Textfields
        kWhTextField.setBorder(null);
        currencyTextField.setBorder(null);
    }

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

