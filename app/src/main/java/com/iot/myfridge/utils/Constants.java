package com.iot.myfridge.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
    public static class VALUES {
        public static final String APP_ID = "df2ce90f";
        public static final String APP_KEY = "077a10621f1c6fc9c58e63267587ea88";
    }

    public static class URLS {
        public static final String BASE_URL = "https://api.edamam.com/";
    }
    public static class FOODLISTS{
        //need to update
        public static final String[] FOOD_LISTS = {"Apple", "Orange", "Pear", "Banana", "Pineapple"};
    }
    /***
    //test
    public static void main(String[] args){
        String test = "Fruit/Food/Plant/Apple/Orange/Monitor/";
        String[] foodRawDetected = test.split("/");
        ArrayList<String> foodDetected = new ArrayList<>();
        for (String i : foodRawDetected){
            if(Arrays.asList(FOODLISTS.FOOD_LISTS).contains(i)){
                foodDetected.add(i);
            }
        }
        System.out.println(foodDetected);
    }
     ***/
}
