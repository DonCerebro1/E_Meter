package com.company;

//import com.company.functions.KwHfunction;
import com.company.ui.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    static JFrame mainFrame = new JFrame();

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                //use more threads
                createGUI();
               // new KwHfunction();
            }
        });
    }

    protected static void createGUI(){
    MainUI ui = new MainUI();
    JPanel root = ui.getRootPanel();
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setContentPane(root);
    mainFrame.pack();
    mainFrame.setTitle("Prototype unstable");
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setSize(500,500);
    mainFrame.setResizable(false);
        JButton addBtn = ui.getAddDevicesButton();
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addBtn.isEnabled()){
                    createAddDeviceUI();
                }
            }
        });
        JButton deviceBtn = ui.getDevicesButton();
        deviceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(deviceBtn.isEnabled()){
                    createDeviceUI();
                }
            }
        });
        JButton statsBtn = ui.getStatisticsButton();
        statsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(statsBtn.isEnabled()){
                    createstatsUI();
                }
            }
        });
        JButton optionBtn = ui.getOptionsButton();
        optionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(optionBtn.isEnabled()){
                    createOptionUI();
                }
            }
        });
    mainFrame.setVisible(true);
}

    /** mainFrame has to be set Visible (true) in all create Methods otherwise we get the delay window bug.
     * If we switch between Windows **/

    private static void createAddDeviceUI(){
        AddDeviceUI ui = new AddDeviceUI();
        JPanel root = ui.getAddDevicePanel();
        mainFrame.setContentPane(root);
        mainFrame.setVisible(true);
    }
    private static void createDeviceUI(){
        DeviceUI ui = new DeviceUI();
        JPanel root = ui.getDevicePanel();
        mainFrame.setContentPane(root);
        mainFrame.setVisible(true);

    }
    private static void createstatsUI(){
        StatsUI ui = new StatsUI();
        JPanel root = ui.getStatsPanel();
        mainFrame.setContentPane(root);
        mainFrame.setVisible(true);
    }
    private static void createOptionUI(){
        OptionsUI ui = new OptionsUI();
        JPanel root = ui.getOptionPanel();
        mainFrame.setContentPane(root);
        mainFrame.setVisible(true);
    }
}
