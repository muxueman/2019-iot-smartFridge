package com.iot.myfridge.data;

import java.util.Date;

public class CurrentGood {

    private int Cid;
    private String name;
    private Date storeDate;   // int year, int month, int date
    private Date expDate;
    private int leftDay;
    private String label;    // same as original basicGood.label
    private String calories; // total calories
    private int quantity;
    private int icon;        // same as original basicGood.id

    // constructor
    public CurrentGood(){
        //this.leftDay = ;
    };

    // setter
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
        //this.leftDay = ;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

