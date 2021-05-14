package com.example.TranTrongHung_kt2_bai1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentNavigationAdapter extends FragmentStatePagerAdapter {
    private int numPage = 3;

    public FragmentNavigationAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Cafebotbien();
            case 1: return new Cafeden();
            case 2: return new Cafesua();
            default: return new Cafebotbien();
        }
    }

    @Override
    public int getCount() {
        return numPage;
    }
}
