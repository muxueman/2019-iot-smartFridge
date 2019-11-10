package com.iot.myfridge.data;

import java.util.Calendar;
import java.util.Date;

public class Noti {

    //private int Nid;
    private int cat; // 0: fridge, 1: exp, 2: purchase, 3: recipe
    private Date notiDate;
    private String content;
    private float temp;
    private String name;

    // constructor
    public Noti(int cat){
        //this.Nid =
        this.cat = cat;
        this.notiDate = Calendar.getInstance().getTime();
        this.content = setContent();
    }
    // constructor for cat = 0
    public Noti(int cat, String name){
        //this.Nid =
        this.cat = cat;
        this.notiDate = Calendar.getInstance().getTime();
        this.name = name;
        this.content = setContent();
    }
    // constructor for cat = 1
    public Noti(int cat, float temp){
        //this.Nid =
        this.cat = cat;
        this.notiDate = Calendar.getInstance().getTime();
        this.temp = temp;
        this.content = setContent();
    }

    public String setContent(){
        String content = "";
        if (cat==0){
            return "Your fridge temperature is : "+ temp + ", it's too high!";
        }
        else if(cat==1){
            return name + " will be expired tomorrow! Eat them!";
        }
        else if(cat == 2){
            return "";
        }
        else if(cat ==3){
            return "";
        }
        else {
            return "none";
        }
    }

    // getter
    public String getContent(){
        return this.content;
    }
    public Date getNotiDate(){
        return this.notiDate;
    }
}
