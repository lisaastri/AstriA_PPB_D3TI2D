package com.astri.m_library;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.astri.m_library.FirstFragment;
import com.astri.m_library.SecondFragment;

public class SlidingTabAdapter extends FragmentStatePagerAdapter {


    private int number_tabs;

    public  SlidingTabAdapter(FragmentManager fm, int number_tabs){
        super(fm);
        this.number_tabs = number_tabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
                default:
                    return null;
        }

    }
    @Override
    public int getCount(){
        return number_tabs;
    }
}
