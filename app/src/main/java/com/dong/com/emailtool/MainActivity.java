package com.dong.com.emailtool;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        mViewPage.setAdapter(new ListFragmentPageAdapter(getSupportFragmentManager()));
        mTabLayou.setupWithViewPager(mViewPage);
    }
}
