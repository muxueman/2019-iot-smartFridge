package com.iot.myfridge.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    // all static variables
    // database version
    private static final int DATABAE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "fridgeDB";

    // currentGoods table name
    private static final String TABLE_Goods = "Goods";

    // Goods table fields
    private static final String Goods_Cid = "id";
    private static final String Goods_Name = "name";
    private static final String Goods_Label = "label";
    private static final String Goods_Calorie = "calorie";
    private static final String Goods_Icon = "icon";

    // currentGoods table name
    private static final String TABLE_CurrentGoods = "Current_Goods";

    // currentGoods table fields
    private static final String CurrentGoods_Cid = "Cid";
    private static final String CurrentGoods_Name = "name";
    private static final String CurrentGoods_StoreDate = "storeDate";
    private static final String CurrentGoods_ExpireDate = "expireDate";
    private static final String CurrentGoods_Quantity = "quantity";
    private static final String CurrentGoods_Calories = "calories";
    // we can use name to find out calorie per quantity, and icon, label in TABLE_GOODS

    // historyGoods table name
    private static final String TABLE_HistoryGoods = "History_Goods";

    // historyGoods table fields
    private static final String HistoryGoods_Hid = "Hid";
    private static final String HistoryGoods_Name = "name";
    private static final String HistoryGoods_EatenDate = "eatenDate";
    private static final String HistoryGoods_Quantity = "quantity";
    private static final String HistoryGoods_Calories = "calories";
    // we can use name to find out calorie per quantity, and icon, label in TABLE_GOODS

    public DatabaseHandler(Context context){
        super(context,DATABASE_NAME,null,DATABAE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        String CREATE_GOODS_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_Goods + "("
                + Goods_Cid + " INTEGER PRIMARY KEY,"
                + Goods_Name + " VARCHAR(30),"
                + Goods_Label + " VARCHAR(20),"
                + Goods_Calorie + " INTEGER,"
                + Goods_Icon + " INTEGER" + ")";
        sqLiteDatabase.execSQL(CREATE_GOODS_TABLE);

        String CREATE_CURRENT_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_CurrentGoods + "("
                + CurrentGoods_Cid + " INTEGER PRIMARY KEY,"
                + CurrentGoods_Name + " VARCHAR(30),"
                + CurrentGoods_StoreDate + " DATETIME,"
                + CurrentGoods_ExpireDate + " DATETIME, "
                + CurrentGoods_Quantity + " INTEGER,"
                + CurrentGoods_Calories + " INTEGER" + ")";
        sqLiteDatabase.execSQL(CREATE_CURRENT_TABLE);

        String CREATE_HISTORY_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_HistoryGoods + "("
                + HistoryGoods_Hid + " INTEGER PRIMARY KEY,"
                + HistoryGoods_Name + " VARCHAR(30),"
                + HistoryGoods_EatenDate + " DATETIME,"
                + HistoryGoods_Quantity + " INTEGER,"
                + HistoryGoods_Calories + " DATETIME" + ")";
        sqLiteDatabase.execSQL(CREATE_HISTORY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Goods);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CurrentGoods);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HistoryGoods);
        // Create tables again
        onCreate(db);
    }

    // getter from TABLE_Goods using name
    public String getIcon(String name){
        SQLiteDatabase db = this.getWritableDatabase();
        String icon = "none";
        //todo
        return icon;
    }

}
