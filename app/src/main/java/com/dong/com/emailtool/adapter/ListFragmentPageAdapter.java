package com.dong.com.emailtool.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dong.com.emailtool.fragment.PageFragment;

/**
 * Created by 95 on 2015/12/28.
 */
public class ListFragmentPageAdapter extends FragmentPagerAdapter {

    final  int PAGE_COUNT=10;
    private String tabTitles[] = new String[]{"Tab2221", "T2", "Tb3", "Tab4", "Tab5555555555","Tab2221", "T2", "Tb3", "Tab4", "Tab5555555555"};



    public ListFragmentPageAdapter( FragmentManager fm) {
      super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position+1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
