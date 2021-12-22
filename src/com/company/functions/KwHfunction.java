package com.company.functions;

import com.company.Data.List;
import com.company.Data.Price;
import com.company.Main;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;

public class KwHfunction implements Price, List {
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
     * toDo: Wenn eine stunde um ist Preis aktualiesieren und alle anderen verbunden Werte (vielleicht mit einem int und for-schleifen counter ?). Zeitspeichern wenn Programm zu ist.
     */



    public KwHfunction() {
           /**
           Für Test zwecke
            */

           //System.out.println("Current KwH: " + kWh);
           //System.out.println("Current Watt: " + watt);


           //Wenn aktiviert öffnet sich dass Fenster nicht. Thread hinzufügen?
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
        totalKwH = kWh * hour ;

        return df.format(totalKwH) + " KwH";
    }

    /**
     * erstmal nur Deutschland bis funktion zur Länderwahl implementiert sind
     * dann als parameter 'flag' implemtieren zur Länderwahl
     * bsp.: public String euPrices(String flag){}
     * individueller Nutzungsdauer durch User eingeben um Tagesverbrauch zuerrechnen
     */
    public String euPrices(){
        double c = de_price * totalKwH / 100;
        return df.format(c) + " Euro";
    }



}
