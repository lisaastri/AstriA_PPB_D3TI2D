package com.astri.ppb;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new halaman1();
            case 1:
                return new halaman2();
            case 2:
                return new halaman3();
        }
        return null;
    }
    @Override
    public int getCount() {

        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "TERBARU";
            case 1:
                return "BUKU";
            case 2:
                return "PINJAMAN";
        }
        return null;
    }
}