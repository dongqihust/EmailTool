package com.dong.com.emailtool.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dong.com.emailtool.R;
import com.dong.com.emailtool.fragment.PageFragment;

/**
 * Created by 95 on 2015/12/28.
 */
public class ListFragmentPageAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private int[] imageResId = {
            R.mipmap.img_group,
            R.mipmap.img_conversation,
            R.mipmap.img_search
    };
    final  int PAGE_COUNT=3;
    private String tabTitles[] = new String[] { "分组", "回话", "搜索" };



    public ListFragmentPageAdapter(Context context, FragmentManager fm) {
      super(fm);
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position+1);
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//      //  return tabTitles[position];
//        //自定义title
//        Drawable image = mContext.getResources().getDrawable(imageResId[position]);
//        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
//
//
//        // Replace blank spaces with image icon
//        SpannableString sb = new SpannableString("   " + tabTitles[position]);
//        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
//
//        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        return sb;
//    }

    public View getTabView(int position){

        View v = LayoutInflater.from(mContext).inflate(R.layout.custom_tab, null);
        TextView mTextView = (TextView) v.findViewById(R.id.custab_text);
        mTextView.setText(tabTitles[position]);
        ImageView mImageView = (ImageView) v.findViewById(R.id.custab_image);
        mImageView.setImageResource(imageResId[position]);
        return v;

    }
}
