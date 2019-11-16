package com.iot.myfridge.data;

import java.util.Date;

public class CurrentGood {

    private int Cid;
    private String name;
    private Date storeDate;   // int year, int month, int date
    private Date expDate;
    private int leftDay;
    private String label;    // same as original basicGood.label
    private int calories; // total calories
    private int quantity;
    private int icon;        // same as original basicGood.id

    // constructor
    public CurrentGood(){
        //this.leftDay = ;
    };
    public CurrentGood(int Cid){
        this.Cid = Cid;
        //todo icon
    }

    // setter
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
        //this.leftDay = ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStoreDate(Date storeDate) {
        this.storeDate = storeDate;
    }

    public void setLeftDay(int leftDay) {
        this.leftDay = leftDay;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // getter

    public int getCid() {
        return Cid;
    }

    public String getName() {
        return name;
    }

    public Date getStoreDate() {
        return storeDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public int getLeftDay() {
        return leftDay;
    }

    public String getLabel() {
        return label;
    }

    public int getCalories() {
        return calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getIcon() {
        return icon;
    }
}

