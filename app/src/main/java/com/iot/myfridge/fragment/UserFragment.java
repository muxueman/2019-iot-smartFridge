package com.iot.myfridge.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iot.myfridge.R;
import com.iot.myfridge.activity.ConnectFridgeActivity;

public class UserFragment extends Fragment  {

    private FloatingActionButton fab;
    private ViewPager viewPager;
    private UserPagerAdapter userPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_user, container, false);
        //userPagerAdapter = new UserPagerAdapter(getSupportFragementManagement())
        viewPager = view.findViewById(R.id.userpager);
        //viewPager.setAdapter(userPagerAdapter);

        fab = view.findViewById(R.id.fridge_user_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showConnectFridgeDialog();
            }
        });

        return view;
    }


    //使用BottomSheetDialog方式实现底部弹窗
    void showConnectFridgeDialog(){
        BottomSheetDialog bottomSheet = new BottomSheetDialog(getActivity());
        bottomSheet.setCancelable(true);
        bottomSheet.setContentView(R.layout.connect_fridge_view);
        bottomSheet.show();
    }




}
