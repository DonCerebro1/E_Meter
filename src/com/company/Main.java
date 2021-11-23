package com.company;

import com.company.ui.MainUI;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
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
    JFrame mainFrame = new JFrame();
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setContentPane(root);
    mainFrame.pack();
    mainFrame.setTitle("E-Meter");
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setVisible(true);

    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Settings");
    bar.add(menu);
    bar.setVisible(true);
    menu.setVisible(true);



}

private static void MenuBar()
{
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Settings");
    bar.add(menu);
    bar.setVisible(true);
    menu.setVisible(true);
}
}
