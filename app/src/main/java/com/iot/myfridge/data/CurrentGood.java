package com.iot.myfridge.data;

import com.iot.myfridge.utils.Constants;
import com.iot.myfridge.utils.DataUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class CurrentGood {

    private String Cid;
    private String name;
    private Date storeDate;   // int year, int month, int date
    private Date expDate;
    private int leftDay;
    private String label;    // same as original basicGood.label
    private int calories; // total calories
    private int quantity;
    private int icon;        // same as original basicGood.id, 改成String = name

    // constructor
    public CurrentGood(){
        //this.leftDay = ;
    };

    public CurrentGood(String name, String storeDate, int quantity){

        this.Cid = UUID.randomUUID().toString();
        this.name = name;
        //this.storeDate = sktoreDate;
        //this.expDate = expDate;
        //this.leftDay = new DataUtil().getDateDiff(storeDate,expDate);
         this.label = new Constants().NameLabel().get(name);
        //this.calories =
        //this.protein =
        //this.fat =
        // this.carbs =
        this.quantity = quantity;
    }
    public CurrentGood(String Cid){
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

    public String getCid() {
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

    // for test
    /***
    public static void main(String[] args){
        ArrayList<CurrentGood> testCurrentLists = new ArrayList<>();
        System.out.println(new DataUtil().getTodaysDate());
        testCurrentLists.add(new CurrentGood("Milk","05", 7));
        testCurrentLists.add(new CurrentGood("Egg","05", 12));
        testCurrentLists.add(new CurrentGood("Orange","05", 2));
        testCurrentLists.add(new CurrentGood("Bread","05", 8));
        testCurrentLists.add(new CurrentGood("Fish","05", 1));
        testCurrentLists.add(new CurrentGood("Orange Juice","05", 1));
        testCurrentLists.add(new CurrentGood("Broccoli","05", 1));
        testCurrentLists.add(new CurrentGood("Carrot","05", 1));
        testCurrentLists.add(new CurrentGood("Spinach","05", 1));
        testCurrentLists.add(new CurrentGood("Chicken Wing","05", 1));
        testCurrentLists.add(new CurrentGood("Chicken Salad","05", 1));
        testCurrentLists.add(new CurrentGood("Apple","05", 4));
        testCurrentLists.add(new CurrentGood("Beef","06", 2));
        testCurrentLists.add(new CurrentGood("Corn","06", 3));
        testCurrentLists.add(new CurrentGood("Tomato","07", 3));
        testCurrentLists.add(new CurrentGood("Ice Cream","07", 1));
        testCurrentLists.add(new CurrentGood("Shrimp","08", 8));
        testCurrentLists.add(new CurrentGood("Chicken Salad","08", 1));
        testCurrentLists.add(new CurrentGood("Cheese Cake","08", 1));
        testCurrentLists.add(new CurrentGood("Chicken Wing","09", 2));
        testCurrentLists.add(new CurrentGood("Apple","09", 3));
        testCurrentLists.add(new CurrentGood("Sushi","10", 1));
        testCurrentLists.add(new CurrentGood("Potato","10", 2));
        testCurrentLists.add(new CurrentGood("Beef","10", 2));
        testCurrentLists.add(new CurrentGood("Spinach","10", 2));
        testCurrentLists.add(new CurrentGood("Broccoli","10", 2));
        testCurrentLists.add(new CurrentGood("Orange","11", 2));
        testCurrentLists.add(new CurrentGood("Orange Juice","11", 1));
        testCurrentLists.add(new CurrentGood("Carrot","11", 1));
        testCurrentLists.add(new CurrentGood("Ham","11", 1));
        testCurrentLists.add(new CurrentGood("orange","05", 2));
    }
     ***/
}

