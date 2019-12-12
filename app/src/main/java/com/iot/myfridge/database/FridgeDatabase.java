package com.iot.myfridge.database;

import com.iot.myfridge.data.CurrentGood;
import com.iot.myfridge.data.Good;
import com.iot.myfridge.data.HistoryGood;
import com.iot.myfridge.utils.DataUtil;

import java.util.ArrayList;

public class FridgeDatabase {

    private ArrayList<CurrentGood> currentGoods;
    private ArrayList<HistoryGood> historyGoods;
    private ArrayList<CurrentGood> balanceGoods;
    public FridgeDatabase(){

        currentGoods = initTestCurrentGoods();
        historyGoods = initTestHistoryFoods();

    }


    public ArrayList<CurrentGood> initTestCurrentGoods(){
        ArrayList<CurrentGood> testCurrentLists = new ArrayList<>();
        System.out.println(new DataUtil().getTodaysDate());
        testCurrentLists.add(new CurrentGood("Milk","05", 7));
        testCurrentLists.add(new CurrentGood("Egg","05", 12));
        testCurrentLists.add(new CurrentGood("Orange","05", 2));
        testCurrentLists.add(new CurrentGood("Bread","05", 8));
        testCurrentLists.add(new CurrentGood("Fish","05", 1));
        testCurrentLists.add(new CurrentGood("Juice","05", 1));
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
        testCurrentLists.add(new CurrentGood("Juice","11", 1));
        testCurrentLists.add(new CurrentGood("Carrot","11", 1));
        testCurrentLists.add(new CurrentGood("Ham","11", 1));
        testCurrentLists.add(new CurrentGood("Orange","05", 2));
        return testCurrentLists;
    }

    public ArrayList<HistoryGood> initTestHistoryFoods(){
        ArrayList<HistoryGood> testHistoryLists = new ArrayList<>();
        //System.out.println(new DataUtil().getTodaysDate());
        testHistoryLists.add(new HistoryGood("Milk", "05", 1));
        testHistoryLists.add(new HistoryGood("Egg", "05", 1));
        testHistoryLists.add(new HistoryGood("Orange", "05", 1));
        testHistoryLists.add(new HistoryGood("Bread", "05", 1));
        testHistoryLists.add(new HistoryGood("Fish", "05", 1));
        testHistoryLists.add(new HistoryGood("Juice", "05", 1));
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

        return testHistoryLists;
    }

    public ArrayList<CurrentGood> getCurrentGoods() {
        return currentGoods;
    }

    public ArrayList<HistoryGood> getHistoryGoods() {
        return historyGoods;
    }

    public CurrentGood searchCurrentById(String id){
        for(CurrentGood c: currentGoods){
            if (c.getCid().equals(id)) {
                return c;
            }
        }
        return getCurrentGoods().get(1);
    }
    public HistoryGood searchHistoryById(String id){
        for(HistoryGood c: historyGoods){
            if (c.getHid().equals(id)) {
                return c;
            }
        }
        return getHistoryGoods().get(1);
    }
}
