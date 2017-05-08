package com.example.tutorial.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captureAndInitialiseUIElements();

    }

    private void captureAndInitialiseUIElements() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);


        InventoryFragment inventoryFragment = (InventoryFragment)
                Fragment.instantiate(getBaseContext(),InventoryFragment.class.getName());
        OpportunitiesFragment opportunitiesFragment = (OpportunitiesFragment)
                Fragment.instantiate(getBaseContext(), OpportunitiesFragment.class.getName());
        ProfileFragment profileFragment = (ProfileFragment)
                Fragment.instantiate(getBaseContext(),ProfileFragment.class.getName());

        MainTabPagerAdapter tabPagerAdapter = new MainTabPagerAdapter(getSupportFragmentManager(),
                Arrays.asList(opportunitiesFragment,inventoryFragment,profileFragment));

        viewPager.setAdapter(tabPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("1st");
        tabLayout.getTabAt(1).setText("2nd");
        tabLayout.getTabAt(2).setText("3rd");
    }

}
