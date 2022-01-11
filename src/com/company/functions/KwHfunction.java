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
        //consumption();

        System.out.println(totalConsumtion());


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
       Excepts only double with a "." not ","
       toDo: Next....Change Format for totalConsumption to display in Textfield
     */
    public String totalConsumtion(){
        String totalConsumption = consumptionLiving() + consumptionKitchen() + consumptionBedRoom();

        return  totalConsumption + " KwH";
    }

    public String consumptionLiving(){
        String objLv  = (String) getDataTableLiving(tableLivingRoom,0,1);
        String obj2Lv = (String) getDataTableLiving(tableLivingRoom,1,1);
        String obj3Lv = (String) getDataTableLiving(tableLivingRoom,2,1);
        String obj4Lv = (String) getDataTableLiving(tableLivingRoom,3,1);
        String obj5LV = (String) getDataTableLiving(tableLivingRoom,4,1);

        String strOne = objLv;
        String strTwo = obj2Lv;
        String strThree = obj3Lv;
        String strFour = obj4Lv;
        String strFive = obj5LV;

        double objOne = 0;
        double objTwo = 0;
        double objThree = 0;
        double objFour = 0;
        double objFive = 0;

        if(strOne != null){
            try {
                objOne = Double.parseDouble(strOne);
            }catch (NumberFormatException e){
            }
        }
        if(strTwo != null){
            try {
                objTwo = Double.parseDouble(strTwo);
            }catch (NumberFormatException e){
            }
        }
        if(strThree != null){
            try {
                objThree = Double.parseDouble(strThree);
            }catch (NumberFormatException e){
            }
        }
        if(strFour != null){
            try{
                objFour = Double.parseDouble(strFour);
            }catch (NumberFormatException e){
            }
        }
        if(strFive != null){
            try {
                objFive = Double.parseDouble(strFive);
            }catch (NumberFormatException e){
            }
        }
        double sumLiving = objOne + objTwo + objThree + objFour + objFive;

        return df.format(sumLiving) + " KwH";
    }

    public String consumptionKitchen(){
        String objK  = (String) getDataTableKitchen(tableKitchen,0,1);
        String objK2 = (String) getDataTableKitchen(tableKitchen,1,1);
        String objK3 = (String) getDataTableKitchen(tableKitchen,2,1);
        String objK4 = (String) getDataTableKitchen(tableKitchen,3,1);
        String objK5 = (String) getDataTableKitchen(tableKitchen,4,1);

        String strOne = objK;
        String strTwo = objK2;
        String strThree = objK3;
        String strFour = objK4;
        String strFive = objK5;

        double objOne = 0;
        double objTwo = 0;
        double objThree = 0;
        double objFour = 0;
        double objFive = 0;

        if(strOne != null){
            try {
                objOne = Double.parseDouble(strOne);
            }catch (NumberFormatException e){
            }
        }
        if(strTwo != null){
            try {
                objTwo = Double.parseDouble(strTwo);
            }catch (NumberFormatException e){
            }
        }
        if(strThree != null){
            try {
                objThree = Double.parseDouble(strThree);
            }catch (NumberFormatException e){
            }
        }
        if(strFour != null){
            try{
                objFour = Double.parseDouble(strFour);
            }catch (NumberFormatException e){
            }
        }
        if(strFive != null){
            try {
                objFive = Double.parseDouble(strFive);
            }catch (NumberFormatException e){
            }
        }
        double sumKitchen = objOne + objTwo + objThree + objFour + objFive;

        return df.format(sumKitchen) + " KwH";
    }

    public String consumptionBedRoom(){
        String objB  = (String) getDataTableBedroom(tableBedroom,0,1);
        String objB2 = (String) getDataTableBedroom(tableBedroom,1,1);
        String objB3 = (String) getDataTableBedroom(tableBedroom,2,1);
        String objB4 = (String) getDataTableBedroom(tableBedroom,3,1);
        String objB5 = (String) getDataTableBedroom(tableBedroom,4,1);

        String strOne = objB;
        String strTwo = objB2;
        String strThree = objB3;
        String strFour = objB4;
        String strFive = objB5;

        double objOne = 0;
        double objTwo = 0;
        double objThree = 0;
        double objFour = 0;
        double objFive = 0;

        if(strOne != null){
            try {
                objOne = Double.parseDouble(strOne);
            }catch (NumberFormatException e){
            }
        }
        if(strTwo != null){
            try {
                objTwo = Double.parseDouble(strTwo);
            }catch (NumberFormatException e){
            }
        }
        if(strThree != null){
            try {
                objThree = Double.parseDouble(strThree);
            }catch (NumberFormatException e){
            }
        }
        if(strFour != null){
            try{
                objFour = Double.parseDouble(strFour);
            }catch (NumberFormatException e){
            }
        }
        if(strFive != null){
            try {
                objFive = Double.parseDouble(strFive);
            }catch (NumberFormatException e){
            }
        }
        double sumBed = objOne + objTwo + objThree + objFour + objFive;

        return df.format(sumBed) + " KwH";

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
