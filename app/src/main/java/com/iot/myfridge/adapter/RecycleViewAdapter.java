package com.iot.myfridge.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.iot.myfridge.R;

import java.util.List;

public class RecycleViewAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public RecycleViewAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.text,item);
    }
}
