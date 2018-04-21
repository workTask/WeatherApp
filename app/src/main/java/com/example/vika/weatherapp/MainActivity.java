package com.example.vika.weatherapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;


import com.example.vika.weatherapp.view.adapter.TabPagerAdapter;
import com.example.vika.weatherapp.view.adapter.ViewPagerAdapter;
import com.example.vika.weatherapp.view.fragment.TabTenDay;
import com.example.vika.weatherapp.view.fragment.TabToday;
import com.example.vika.weatherapp.view.fragment.TabTomorrow;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate: start");

        viewPager = (ViewPager)findViewById(R.id.pager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void setupViewPager(ViewPager  viewPager){
        Log.i(TAG,"Start setupViewPager");
      ViewPagerAdapter  adapter = new ViewPagerAdapter(getSupportFragmentManager());

      adapter.addFragment(new TabToday(), String.valueOf(getResources().getText(R.string.titleToDay)));
      adapter.addFragment(new TabTomorrow(), String.valueOf(getResources().getText(R.string.titleTomorrow)));
      adapter.addFragment(new TabTenDay(), String.valueOf(getResources().getText(R.string.titleTenDays)));
      viewPager.setAdapter(adapter);

    }
}
