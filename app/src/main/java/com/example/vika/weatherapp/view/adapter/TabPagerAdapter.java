package com.example.vika.weatherapp.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.vika.weatherapp.view.fragment.TabTenDay;
import com.example.vika.weatherapp.view.fragment.TabToday;
import com.example.vika.weatherapp.view.fragment.TabTomorrow;

/**
 * Created by Vika on 21.04.2018.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                TabToday tabToday = new TabToday();
                return tabToday;
            case 1:
                TabTomorrow tabTomorrow = new TabTomorrow();
                return tabTomorrow;
            case 2:
                TabTenDay tabTenDay = new TabTenDay();
                return  tabTenDay;
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
