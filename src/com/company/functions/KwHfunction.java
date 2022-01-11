package com.company.functions;

import com.company.Data.List;
import com.company.Data.Price;
import com.company.ui.DeviceUI;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class KwHfunction extends DeviceUI implements Price, List {
    public Calendar calendar;
    public SimpleDateFormat timeFormat;
    public String time;
    double watt;
    public String name;
    public double totalKwH;
    public double hour = 1;
    public int hourYear = 1000;
    public double kWh = watt * hour / hourYear;
    public int str;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public KwHfunction() {
           /**
           for testing only */

           //System.out.println("Current KwH: " + kWh);
           //System.out.println("Current Watt: " + watt);

           //if activated, the window does not open. Add thread?
           //time();
        consumption();

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

    /*
        Hier dran das nächstes mal weiter Arbeiten
     */
    public String consumption(){
        int i;
        int x;

        Object obj  = getData(tableLivingRoom,0,1);
        Object obj2 = getData(tableLivingRoom,1,1);
        Object obj3 = getData(tableLivingRoom,2,1);
        Object obj4 = getData(tableLivingRoom,3,1);
        Object obj5 = getData(tableLivingRoom,4,1);




        try {
            int sum = (int) obj + (int) obj2 + (int) obj3 + (int) obj4 + (int) obj5;
            System.out.println("Alles zusammen sind: " + sum);
        }catch (Exception e){
            System.out.println("Irgendwas läuft falsch");
        }




       // return df.format(obj) + " KwH";
        return (String) obj + "KwH";
    }

    public String euPrices(){
        double c = de_price * totalKwH / 100;
        return df.format(c) + " Euro";
    }

    public Object getData(JTable tableLivingRoom, int row_index, int col_index){
        return tableLivingRoom.getModel().getValueAt(row_index,col_index);
    }
}
