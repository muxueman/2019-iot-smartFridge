package com.iot.myfridge.data;

import com.iot.myfridge.utils.DataUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class HistoryGood {

    private String Hid;
    private String name;
    private Date eatenDate;
    private int calories;
    private int quantity;
    private String label;
    private int icon;

    // constructor
    public HistoryGood(){};
    public HistoryGood(String name, String eatenDate, int quantity){
        this.Hid = UUID.randomUUID().toString();
        this.name = name;
        this.quantity =quantity;
        //this.eatenDate =
        //this.calories = this.quantity*
        //this.label =
    }
    public HistoryGood(String Hid){
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

    public String getHid() {
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

    /***
    public static void main(String[] args) {
        ArrayList<HistoryGood> testHistoryLists = new ArrayList<>();
        //System.out.println(new DataUtil().getTodaysDate());
        testHistoryLists.add(new HistoryGood("Milk", "05", 1));
        testHistoryLists.add(new HistoryGood("Egg", "05", 1));
        testHistoryLists.add(new HistoryGood("Orange", "05", 1));
        testHistoryLists.add(new HistoryGood("Bread", "05", 1));
        testHistoryLists.add(new HistoryGood("Fish", "05", 1));
        testHistoryLists.add(new HistoryGood("Orange Juice", "05", 1));
        testHistoryLists.add(new HistoryGood("Broccoli", "05", 1));
        testHistoryLists.add(new HistoryGood("Rice", "05", 1));
        testHistoryLists.add(new HistoryGood("Apple", "05", 1));
        testHistoryLists.add(new HistoryGood("Chicken Salad", "05", 1));
        testHistoryLists.add(new HistoryGood("Milk", "06", 1));
        testHistoryLists.add(new HistoryGood("Egg", "06", 1));
        testHistoryLists.add(new HistoryGood("Apple", "06", 1));
        testHistoryLists.add(new HistoryGood("Bread", "06", 1));
        testHistoryLists.add(new HistoryGood("Beef", "06", 1));
        testHistoryLists.add(new HistoryGood("Rice", "06", 1));
        testHistoryLists.add(new HistoryGood("Spinach", "06", 1));
        testHistoryLists.add(new HistoryGood("Corn", "06", 1));
        testHistoryLists.add(new HistoryGood("Chicken Wing", "06", 1));
        testHistoryLists.add(new HistoryGood("Milk", "07", 1));
        testHistoryLists.add(new HistoryGood("Egg", "07", 2));
        testHistoryLists.add(new HistoryGood("Apple", "07", 1));
        testHistoryLists.add(new HistoryGood("Bread", "07", 1));
        testHistoryLists.add(new HistoryGood("Rice", "07", 1));
        testHistoryLists.add(new HistoryGood("Tomato", "07", 2));
        testHistoryLists.add(new HistoryGood("Beef", "07", 1));
        testHistoryLists.add(new HistoryGood("Corn", "07", 1));
        testHistoryLists.add(new HistoryGood("Carrot", "07", 1));
        testHistoryLists.add(new HistoryGood("Milk","08" , 1));
        testHistoryLists.add(new HistoryGood("Egg", "08", 1));
        testHistoryLists.add(new HistoryGood("Bread", "08", 2));
        testHistoryLists.add(new HistoryGood("Apple", "08", 1));
        testHistoryLists.add(new HistoryGood("Rice", "08", 1));
        testHistoryLists.add(new HistoryGood("Shrimp", "08", 4));
        testHistoryLists.add(new HistoryGood("Cheese Cake", "08", 1));
        testHistoryLists.add(new HistoryGood("Orange", "08", 1));
        testHistoryLists.add(new HistoryGood("Chicken Salad", "08", 1));
        testHistoryLists.add(new HistoryGood("Ice Cream", "08", 1));
        testHistoryLists.add(new HistoryGood("Milk", "09", 1));
        testHistoryLists.add(new HistoryGood("Egg", "09", 1));
        testHistoryLists.add(new HistoryGood("Bread", "09", 1));
        testHistoryLists.add(new HistoryGood("Apple", "09", 1));
        testHistoryLists.add(new HistoryGood("Rice", "09", 1));
        testHistoryLists.add(new HistoryGood("Corn", "09", 1));
        testHistoryLists.add(new HistoryGood("Chicken Wing", "09", 2));
        testHistoryLists.add(new HistoryGood("Milk", "10", 1));
        testHistoryLists.add(new HistoryGood("Egg", "10", 1));
        testHistoryLists.add(new HistoryGood("Bread", "10", 1));
        testHistoryLists.add(new HistoryGood("Apple", "10", 1));
        testHistoryLists.add(new HistoryGood("Rice", "10", 1));
        testHistoryLists.add(new HistoryGood("Sushi", "10", 1));
        testHistoryLists.add(new HistoryGood("Tomato", "10", 1));
        testHistoryLists.add(new HistoryGood("Potato", "10", 1));
        testHistoryLists.add(new HistoryGood("Beef", "10", 1));
        testHistoryLists.add(new HistoryGood("Spinach", "10", 1));
        testHistoryLists.add(new HistoryGood("Rice", "10", 1));
        testHistoryLists.add(new HistoryGood("Milk", "11", 1));
        testHistoryLists.add(new HistoryGood("Egg", "11", 1));
        testHistoryLists.add(new HistoryGood("Bread", "11", 1));
        testHistoryLists.add(new HistoryGood("Apple", "11", 1));
        testHistoryLists.add(new HistoryGood("Rice", "11", 1));
        testHistoryLists.add(new HistoryGood("Orange", "11", 1));
        testHistoryLists.add(new HistoryGood("Potato", "11", 1));
        testHistoryLists.add(new HistoryGood("Beef", "11", 1));
        testHistoryLists.add(new HistoryGood("Spinach", "11", 1));
    }
     ***/
}
