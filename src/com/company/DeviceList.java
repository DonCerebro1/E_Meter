package com.company;

import com.company.Data.List;

public class DeviceList implements List {
    int id;
    String name;
    String watt;
    String usageTime;

    public DeviceList(String deviceNameTextfield, String deviceWattTextfield, String deviceNutzungTextfield) {
        this.name = deviceNameTextfield;
        this.watt = deviceWattTextfield;
        this.usageTime = deviceNutzungTextfield;
    }

    @Override
    public String toString() {
        return  "Name: " + name  +
                ", Watt: " + watt +
                ", Nutzungsdauer: " + usageTime;
    }
}
