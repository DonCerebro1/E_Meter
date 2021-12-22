package com.company;

import com.company.Data.List;

public class HomeRooms implements List {
    String name;

    public HomeRooms(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
