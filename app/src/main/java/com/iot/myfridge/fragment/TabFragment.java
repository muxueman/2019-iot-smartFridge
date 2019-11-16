package com.iot.myfridge.fragment;
// hfood
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.iot.myfridge.R;
import com.iot.myfridge.adapter.RecycleViewAdapter;
import com.iot.myfridge.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class TabFragment extends Fragment {

    @BindView(R.id.recycler)
    RecyclerView mRecyclerView;
    Unbinder unbinder;
    private List<String> mdata = new ArrayList<>();
    private List<String> imageUrl = new ArrayList<>();
    int mPosition;
    private RecycleViewAdapter mAdapter;
    private Banner mBanner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        mPosition = getArguments().getInt("position");
        initView();
        initData();

        return rootView;
    }


    private void initView() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new RecycleViewAdapter(R.layout.food_item_view, mdata);

        View top = getLayoutInflater().inflate(R.layout.layout_banner, (ViewGroup) mRecyclerView.getParent(), false);
        mBanner = top.findViewById(R.id.banner);
        mAdapter.addHeaderView(top);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            mdata.add("Apple");
        }
        mAdapter.setNewData(mdata);//模拟网络请求成功后要调用这个方法刷新数据
        if (mPosition == 0) {
            imageUrl.clear();
            imageUrl.add("http://i1.chuimg.com/426809f97f0c41d5a4b8c121aa019cb4_1080w_810h.jpg");
            imageUrl.add("http://i2.chuimg.com/89de42bf21914e74ad1e492634de9635_1656w_1242h.jpg");
            imageUrl.add("http://i1.chuimg.com/7b29ab748a8211e6b87c0242ac110003_2048w_1536h.jpg");
            initBanner(imageUrl);
        } else {
            mBanner.setVisibility(View.GONE);
        }

    }

    private void initBanner(List<String> imageUrl) {
        mBanner.setImages(imageUrl)
                .setImageLoader(new GlideImageLoader())
                .setDelayTime(3000)
                .start();
        mBanner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {

            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    //如果你需要考虑更好的体验，可以这么操作
    @Override
    public void onStart() {
        super.onStart();
        //开始轮播
        mBanner.startAutoPlay();
    }

    @Override
    public void onStop() {
        super.onStop();
        //结束轮播
        mBanner.stopAutoPlay();
    }
}
