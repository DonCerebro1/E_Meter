package com.company.functions;

import com.company.Data.List;
import com.company.Data.Price;
import com.company.DeviceList;
import com.company.ui.AddDeviceUI;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class KwHfunction extends AddDeviceUI implements Price, List {
    public Calendar calendar;
    public SimpleDateFormat timeFormat;
    public String time;
    double watt;
    public String name;
    public double totalKwH;
    public double hour = 1;
    public int hourYear = 1000;
    public double kWh = watt * hour / hourYear;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     for testing only
     Checks whether element is selected and not empty */

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Check")) {
            int index = list.getSelectedIndex();
            System.out.println("Index Selected: " + index);
            DeviceList s = list.getSelectedValue();
            System.out.println("Value Selected: " + s);
        }
    }

    public KwHfunction() {
           /**
           for testing only */

           //System.out.println("Current KwH: " + kWh);
           //System.out.println("Current Watt: " + watt);

           //if activated, the window does not open. Add thread?
           //time();
    }

    public void time(){
        timeFormat = new SimpleDateFormat("hh:mm");
        time = timeFormat.format(Calendar.getInstance().getTime());
        //System.out.println(time);
        setTime();
    }

    public void setTime(){
        while (true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            System.out.println(time);
            try{
                Thread.sleep(60*1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public String consumption(){
        if(!model.isEmpty()){
            int index = list.getSelectedIndex();
            System.out.println("Index selected: " + index);
            DeviceList s =  list.getSelectedValue();
            System.out.println("Value Selected: " + s);
        }
        totalKwH = kWh * hour ;

        return df.format(totalKwH) + " KwH";
    }

    public String euPrices(){
        double c = de_price * totalKwH / 100;
        return df.format(c) + " Euro";
    }
}
