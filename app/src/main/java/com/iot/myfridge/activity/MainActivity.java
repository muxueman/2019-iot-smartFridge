package com.iot.myfridge.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;

import com.iot.myfridge.R;
import com.iot.myfridge.adapter.ViewPagerAdapter;
import com.iot.myfridge.fragment.NotificationFragment;
import com.iot.myfridge.fragment.HomeFragment;
import com.iot.myfridge.fragment.UserFragment;
import com.iot.myfridge.utils.ActivityUtils;
import com.iot.myfridge.utils.BottomNavigationViewHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.navigation)
    BottomNavigationView navigation;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    private MenuItem menuItem;

    private boolean mIsExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ActivityUtils.StatusBarLightMode(this);
        ActivityUtils.setStatusBarColor(this, R.color.cornflowerblue);//设置状态栏颜色
        initView();

    }

    private void initView() {

        //默认 >3 的选中效果会影响ViewPager的滑动切换时的效果，故利用反射去掉
        BottomNavigationViewHelper.disableShiftMode(navigation);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new NotificationFragment());
        adapter.addFragment(new UserFragment());
        viewpager.setAdapter(adapter);
        viewpager.setCurrentItem(0);

        //缓存3个页面，来解决点击“我的”回来，首页空白的问题，
        // 存在的问题，如果有的页面不需要缓存该如何自动刷新，可以利用eventbus传参来进行该页面的操作
        //viewpager.setOffscreenPageLimit(3);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        viewpager.setCurrentItem(0);//Memory
                        return true;
                    case R.id.navigation_community:
                        viewpager.setCurrentItem(1);//Add
                        return true;
                    case R.id.navigation_user:
                        viewpager.setCurrentItem(3);//Me
                        return true;
                }
                return false;
            }
        });

        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    navigation.getMenu().getItem(0).setChecked(false);
                }
                menuItem = navigation.getMenu().getItem(position);
                menuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }


    /**
     * 双击退出应用
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (mIsExit) {
                this.finish();
            } else {
                Toast.makeText(this, "rey again", Toast.LENGTH_SHORT).show();
                mIsExit = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mIsExit = false;
                    }
                }, 2000);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}
