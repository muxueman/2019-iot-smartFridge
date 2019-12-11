package com.iot.myfridge.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.iot.myfridge.R;
import com.iot.myfridge.data.CurrentGood;
import com.iot.myfridge.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    private Context context;
    private ArrayList<CurrentGood> goods;
    public RecycleViewAdapter(int layoutResId, @Nullable List<String> data, Context context) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        helper.setText(R.id.item_name,item);
        helper.setText(R.id.item_quantity,getQuantity(item) + " " + getUnit(getLabel(item)));
        helper.setText(R.id.item_calorie,getCalorie(item) + " kal");
        helper.setText(R.id.item_left,"2" + " days left");
        helper.setImageResource(R.id.iterm_icon, getDrawable(item));
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


}
