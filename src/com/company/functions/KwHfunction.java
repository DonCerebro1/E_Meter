package com.company.functions;

import com.company.Data.List;
import com.company.Data.Price;
import com.company.ui.DeviceUI;
import com.sun.jdi.InvocationException;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
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
       Is working except he is only calculating if all Elements are inside.
       Need to change it that he starts calculating if one element is inside.
     */
    public String consumption(){



        String objLv  = (String) getDataTableLiving(tableLivingRoom,0,1);
        String obj2Lv = (String) getDataTableLiving(tableLivingRoom,1,1);
        String obj3Lv = (String) getDataTableLiving(tableLivingRoom,2,1);
        String obj4Lv = (String) getDataTableLiving(tableLivingRoom,3,1);

        String strOne = objLv;
        String strTwo = obj2Lv;
        String strThree = obj3Lv;
        String strFour = obj4Lv;

        int objOne = 0;
        int objTwo = 0;
        int objThree = 0;
        int objFour = 0;
        if(strOne != null && strTwo != null && strThree != null && strFour != null){
            try {
                objOne = Integer.parseInt(strOne);
                objTwo = Integer.parseInt(strTwo);
                objThree = Integer.parseInt(strThree);
                objFour = Integer.parseInt(strFour);
            }catch (NumberFormatException e){
            }
        }

        int sumLiving = objOne + objTwo + objThree + objFour;

        System.out.println("Die Summe ist: " + sumLiving);


        return df.format(sumLiving) + " KwH";
    }



    public String euPrices(){
        double c = de_price * totalKwH / 100;
        return df.format(c) + " Euro";
    }

    //gets the Value inside all JTable in specific row and col
    public Object getDataTableLiving(JTable tableLivingRoom, int row_index, int col_index){
        return tableLivingRoom.getModel().getValueAt(row_index,col_index);
    }
    public Object getDataTableKitchen(JTable tableKitchen,int row_index, int col_index){
        return tableKitchen.getModel().getValueAt(row_index,col_index);
    }
    public Object getDataTableBedroom(JTable tableBedroom, int row_index, int col_index){
        return tableBedroom.getModel().getValueAt(row_index,col_index);
    }


}
