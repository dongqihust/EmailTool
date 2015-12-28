package com.dong.com.emailtool;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.dong.com.emailtool.adapter.ListFragmentPageAdapter;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.main_viewpager)
    private ViewPager mViewPage;
    @ViewInject(R.id.main_sliding_tabs)
    private TabLayout mTabLayou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

        ListFragmentPageAdapter pageAdapter = new ListFragmentPageAdapter(this, getSupportFragmentManager());
        mViewPage.setAdapter(pageAdapter);
        mTabLayou.setTabGravity(TabLayout.GRAVITY_FILL);
        mTabLayou.setTabMode(TabLayout.MODE_FIXED);

        //如果是自定义view的TabLayout讲导致select样式失效
       mTabLayou.setupWithViewPager(mViewPage);

        mTabLayou.setTabTextColors(Color.RED, Color.GREEN);
        for(int i=0;i<mTabLayou.getTabCount();i++){
            TabLayout.Tab tab = mTabLayou.getTabAt(i);
            tab.setCustomView(pageAdapter.getTabView(i));
        }
        mViewPage.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayou));
        mTabLayou.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPage));



    }
}
