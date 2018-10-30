package com.matt2393.horapp.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.matt2393.horapp.Fragments.FragmentDia;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<FragmentDia> dias;
    private ArrayList<String> titulos;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<FragmentDia> dias, ArrayList<String> tits) {
        super(fm);
        this.dias=dias;
        this.titulos=tits;
    }

    @Override
    public Fragment getItem(int position) {
        return dias.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titulos.get(position);
    }

    @Override
    public int getCount() {
        return dias.size();
    }
}
