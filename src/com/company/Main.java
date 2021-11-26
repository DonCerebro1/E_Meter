package com.company;

import com.company.ui.DeviceUI;
import com.company.ui.MainUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    static JFrame mainFrame = new JFrame();
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                CreateGUI();


            }
        });
    }

private static void CreateGUI()
{
    MainUI ui = new MainUI();
    JPanel root = ui.getRootPanel();
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setContentPane(root);
    mainFrame.pack();
    mainFrame.setTitle("E-Meter");
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setSize(500,500);
    mainFrame.setResizable(false);
    mainFrame.setVisible(true);
    mainFrame.setJMenuBar(Menu());

}

//Funktioniert aber daß Frame ändert sich erst wenn man das programm auf den anderen Bildschirm zieht
private static void CreateDeviceGUI()
{
    DeviceUI deviceUI = new DeviceUI();
    JPanel devicePanel = deviceUI.getDevicePanel();
    JButton addButton = deviceUI.getAddDeviceButton();
    mainFrame.add(addButton);


    mainFrame.setContentPane(devicePanel);

}

public static JMenuBar Menu()
{
    JMenuBar bar = new JMenuBar();
    JMenu device = new JMenu("Devices");
    JMenuItem addDevice = new JMenuItem(" add Devices");
    device.add(addDevice);
    JMenu setting = new JMenu("Settings");
    bar.add(device);
    bar.add(setting);
    bar.setVisible(true);
    device.setVisible(true);
    setting.setVisible(true);

    addDevice.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                CreateDeviceGUI();

        }
    });

    return bar;
}

}
