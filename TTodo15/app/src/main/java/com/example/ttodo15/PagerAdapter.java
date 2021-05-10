package com.example.ttodo15;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter
{
    int mNumOfTabs;
    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.mNumOfTabs =behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new tabfragment1();
            case 1: return new tabfragement2();
            case 2: return new tabfragment3();
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return  mNumOfTabs;
    }
}
