package com.dong.com.emailtool.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dong.com.emailtool.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

/**
 * Created by 95 on 2015/12/28.
 */

@ContentView(R.layout.fragment_page)
public class PageFragment extends  BaseFragment {


    @ViewInject(R.id.fragment_textview)
    private TextView mTextView;
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
        mTextView.setText(String.valueOf(mPage));
    }

    public  static  PageFragment newInstance(int page){
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }
}
