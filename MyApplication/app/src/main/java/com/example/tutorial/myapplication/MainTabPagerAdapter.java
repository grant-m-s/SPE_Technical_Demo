package com.example.tutorial.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class MainTabPagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragments;

    public MainTabPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Opportunities";
            case 1:
                return "Inventory";
            case 2:
                return "Profile";
            default:
                return "Unknown";

        }
    }
}
