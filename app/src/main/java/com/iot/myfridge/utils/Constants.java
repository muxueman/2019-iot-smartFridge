package com.iot.myfridge.utils;

import com.iot.myfridge.data.CurrentGood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        public static final String[] FOOD_LISTS = {"Apple", "Orange", "Pear", "Banana", "Pineapple","Broccoli","Orange Juice", "Juice"};
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
    public Map<String, String> LabelUnit(){
        Map<String, String> labelUnits= new HashMap<>();
        labelUnits.put("Vegetables","dish");
        labelUnits.put("Bread","slice");
        labelUnits.put("Rice","bowl");
        labelUnits.put("Staple Food","bowl");
        labelUnits.put("Coarse Grain","portion");
        labelUnits.put("Fruit","each");
        labelUnits.put("Milk","bottle");
        labelUnits.put("Egg","each");
        labelUnits.put("Meat","portion");
        labelUnits.put("Sea Food","piece");
        labelUnits.put("Fish","piece");
        labelUnits.put("Sweets","portion");
        labelUnits.put("Junk Food","portion");
        labelUnits.put("Sugar Drinks","bottle");
        // 14
        return labelUnits;
    }
    public void LabelPyramid(){
        Map<String, Integer> labelPyramids= new HashMap<>();
        //0->4 from bottom to top 1->5
        labelPyramids.put("Bread",0);
        labelPyramids.put("Rice",0);
        labelPyramids.put("Coarse Grain",0);
        labelPyramids.put("Vegetables",1);
        labelPyramids.put("Fruit",2);
        labelPyramids.put("Milk",3);
        labelPyramids.put("Egg",3);
        labelPyramids.put("Meat",3);
        labelPyramids.put("Sea Food",3);
        labelPyramids.put("Fish",3);
        labelPyramids.put("Sweets",4);
        labelPyramids.put("Junk Food",4);
        labelPyramids.put("Sugar Drinks",4);
    }

    public Map<String, String> NameLabel() {
        Map<String, String> nameLabels = new HashMap<>();
        nameLabels.put("Milk","Milk");
        nameLabels.put("Egg","Egg");
        nameLabels.put("Orange","Fruit");
        nameLabels.put("Bread","Bread");
        nameLabels.put("Fish","Fish");
        nameLabels.put("Juice","Sugar Drinks");
        nameLabels.put("Broccoli","Vegetables");
        nameLabels.put("Carrot","Vegetables");
        nameLabels.put("Spinach","Vegetables");
        nameLabels.put("Chicken Wing","Meat");
        nameLabels.put("Chicken Salad","Meat");
        nameLabels.put("Apple","Fruit");
        nameLabels.put("Beef","Meat");
        nameLabels.put("Corn","Vegetables");
        nameLabels.put("Tomato","Vegetables");
        nameLabels.put("Ice Cream","Sweets");
        nameLabels.put("Shrimp","Sea Food");
        nameLabels.put("Cheese Cake","Sweets");
        nameLabels.put("Sushi","Coarse Grain");
        nameLabels.put("Potato","Vegetables");
        nameLabels.put("Ham","Meat");
        return nameLabels;
    }

    public Map<String, String> NameCal(){
        Map<String, Integer> nameCals = new HashMap<>();
        nameCals.put("Milk",23);
        nameLabels.put("Egg","Egg");
        nameLabels.put("Orange","Fruit");
        nameLabels.put("Bread","Bread");
        nameLabels.put("Fish","Fish");
        nameLabels.put("Juice","Sugar Drinks");
        nameLabels.put("Broccoli","Vegetables");
        nameLabels.put("Carrot","Vegetables");
        nameLabels.put("Spinach","Vegetables");
        nameLabels.put("Chicken Wing","Meat");
        nameLabels.put("Chicken Salad","Meat");
        nameLabels.put("Apple","Fruit");
        nameLabels.put("Beef","Meat");
        nameLabels.put("Corn","Vegetables");
        nameLabels.put("Tomato","Vegetables");
        nameLabels.put("Ice Cream","Sweets");
        nameLabels.put("Shrimp","Sea Food");
        nameLabels.put("Cheese Cake","Sweets");
        nameLabels.put("Sushi","Coarse Grain");
        nameLabels.put("Potato","Vegetables");
        nameLabels.put("Ham","Meat");
        return nameCals;
    }

}
