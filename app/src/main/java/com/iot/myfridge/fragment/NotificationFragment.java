package com.iot.myfridge.fragment;



import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.iot.myfridge.R;
import com.iot.myfridge.activity.GridActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class NotificationFragment extends Fragment  {

    @BindView(R.id.tvQuery)
    EditText tvQuery;
    @BindView(R.id.btnSearch)
    Button btnSearch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        ButterKnife.bind(this,view);
        tvQuery.setText( "chicken" );
        /***
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showConnectFridgeDialog();
            }
        });
         ***/
        setOnlistener();
        return view;
    }

    public void setOnlistener() {
        String q = tvQuery.getText().toString();
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed();
            }
        });

    }


    public void buttonPressed() {
        String q = tvQuery.getText().toString();

        if( !q.isEmpty() ) {
            Intent intent = new Intent(getActivity(), GridActivity.class);
            intent.putExtra(getString(R.string.intent_query_key), tvQuery.getText().toString());
            this.getActivity().startActivity(intent);
        }
    }
    //使用BottomSheetDialog方式实现底部弹窗
    void showConnectFridgeDialog(){
        BottomSheetDialog bottomSheet = new BottomSheetDialog(getActivity());
        bottomSheet.setCancelable(true);
        bottomSheet.setContentView(R.layout.connect_fridge_view);
        bottomSheet.show();
    }
}
