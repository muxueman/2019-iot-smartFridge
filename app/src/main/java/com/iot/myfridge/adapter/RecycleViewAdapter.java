package com.iot.myfridge.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.iot.myfridge.R;
import com.iot.myfridge.data.CurrentGood;
import com.iot.myfridge.data.Good;
import com.iot.myfridge.data.HistoryGood;
import com.iot.myfridge.database.FridgeDatabase;
import com.iot.myfridge.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    private Context context;
    private ArrayList<CurrentGood> goods;
    private int position;
    private FridgeDatabase fridgeDatabase;
    public RecycleViewAdapter(int layoutResId, @Nullable List<String> data, Context context, int position, FridgeDatabase fridgeDatabase) {
        super(layoutResId, data);
        this.context = context;
        this.position = position;
        this.fridgeDatabase=fridgeDatabase;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        switch (position){
            case 0:
                helper.setText(R.id.item_name,"Apple");
                helper.setText(R.id.item_quantity,"1 piece");
                helper.setText(R.id.item_calorie,"3" + " kal");
                helper.setText(R.id.item_left,"2019-12-02");
                helper.setImageResource(R.id.iterm_icon, R.drawable.apple);
                break;
            case 1:
                CurrentGood c = fridgeDatabase.searchCurrentById(item);
                helper.setText(R.id.item_name,c.getName());
                helper.setText(R.id.item_quantity,c.getQuantity()+ " " + getUnit(getLabel(c.getName())));
                helper.setText(R.id.item_calorie,c.getCalories() + " kal");
                helper.setText(R.id.item_left,c.getStoreDate());
                helper.setImageResource(R.id.iterm_icon, getDrawable(c.getName()));
                break;
            case 2:
                HistoryGood h = fridgeDatabase.searchHistoryById(item);
                helper.setText(R.id.item_name,h.getName());
                helper.setText(R.id.item_quantity,h.getQuantity()+ " " + getUnit(getLabel(h.getName())));
                helper.setText(R.id.item_calorie,h.getCalories() + " kal");
                helper.setText(R.id.item_left,h.getEatenDate());
                helper.setImageResource(R.id.iterm_icon, getDrawable(h.getName()));
                break;
            case 3:
                helper.setText(R.id.item_name,"Pear");
                helper.setText(R.id.item_quantity,"1 piece");
                helper.setText(R.id.item_calorie,"3" + " kal");
                helper.setText(R.id.item_left,"2019-12-02");
                helper.setImageResource(R.id.iterm_icon, R.drawable.apple);
                break;
                default:break;
        }
    }

    public String getUnit(String label){
        return new Constants().LabelUnit().get(label);
    }
    public String getLabel(String name){
        return new Constants().NameLabel().get(name);
    }
    public String getQuantity(String name){
        //
        int quantity = 1;
        return Integer.toString(quantity);
    }
    public String getCalorie(String name){
        int cal = new Constants().NameCal().get(name);
        return Integer.toString(cal);
    }

    public int getDrawable(String name){
        String drawID = name.toLowerCase().replace(" ", "_");
        //drawID = "R.id." + drawID;
        int id = context.getResources().getIdentifier(drawID, "drawable", context.getPackageName());
        //Drawable drawable = getDrawable(Integer.toString(id));
        return id;
    }

    public String getTextDay(String item){
        if(position ==0 ){
            return "2 days left";
        }
        else if(position == 1){
            return "2019-12-04";
        }
        else if(position ==2){
            return "2019-12-05";
        }
        else if(position ==3){
            return "";
        }
        return "";
    }


}
