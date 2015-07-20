package com.example.diksha.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Tabsadapter extends FragmentStatePagerAdapter{

    private int TOTAL_TABS = 5;

    public Tabsadapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int index) {
        // TODO Auto-generated method stub
        switch (index) {
            case 0:
                return new Friendsfragment();

            case 1:
                return new PublicprofileFragment();

            case 2:
                return new Communityfragment();
            case 3:
                return new Communityfragment1();
            case 4:
                return new Communityfragment2();
        }

        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return TOTAL_TABS;
    }
}
