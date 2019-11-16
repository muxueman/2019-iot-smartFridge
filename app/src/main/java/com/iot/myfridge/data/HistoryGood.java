package com.iot.myfridge.data;

import java.util.Date;

public class HistoryGood {

    private int Hid;
    private String name;
    private Date eatenDate;
    private int calories;
    private int quantity;
    private String label;
    private int icon;

    // constructor
    public HistoryGood(){};
    public HistoryGood(int Hid){
        this.Hid = Hid;
    }
    // setter

    public void setName(String name) {
        this.name = name;
    }

    public void setEatenDate(Date eatenDate) {
        this.eatenDate = eatenDate;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }


    // getter

    public int getHid() {
        return Hid;
    }

    public String getName() {
        return name;
    }

    public Date getEatenDate() {
        return eatenDate;
    }

    public int getCalories() {
        return calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLabel() {
        return label;
    }

    public int getIcon() {
        return icon;
    }
}
