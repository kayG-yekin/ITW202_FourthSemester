package com.example.ttodo15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;


import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tablayout = findViewById(R.id.tablayout);
        tablayout.addTab(tablayout.newTab().setText("frag1"));
        tablayout.addTab(tablayout.newTab().setText("frag2"));
        tablayout.addTab(tablayout.newTab().setText("frag3"));


        ViewPager viewPager = findViewById(R.id.viewpager);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
//
            }
        });
    }
}