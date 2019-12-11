package com.iot.myfridge.adapter;

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

    private ArrayList<CurrentGood> goods;
    public RecycleViewAdapter(int layoutResId, @Nullable List<String> data, ArrayList<CurrentGood> goods) {
        super(layoutResId, data);
        this.goods = goods;
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        helper.setText(R.id.item_name,item);
        helper.setText(R.id.item_quantity,"5" + " " + getUnit(getLabel(item)));
        helper.setText(R.id.item_calorie,"100" + " kal");
        helper.setText(R.id.item_left,"2" + " days left");
        helper.setImageResource(R.id.iterm_icon, R.drawable.cheese_cake);
    }

    public String getUnit(String label){
        return new Constants().LabelUnit().get(label);
    }
    public String getLabel(String name){
        return new Constants().NameLabel().get(name);
    }
    public int getQuantity(String name){
        //
        return 1;
    }
}
