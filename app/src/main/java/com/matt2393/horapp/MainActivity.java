package com.matt2393.horapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.matt2393.horapp.Adapter.ViewPagerAdapter;
import com.matt2393.horapp.Fragments.FragmentDia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);

        ArrayList<FragmentDia> dias = new ArrayList<>();
        dias.add(new FragmentDia());
        dias.add(new FragmentDia());
        dias.add(new FragmentDia());
        dias.add(new FragmentDia());

        ArrayList<String> tits = new ArrayList<>();
        tits.add("Lunes");
        tits.add("Martes");
        tits.add("Miercoles");
        tits.add("Jueves");

        ViewPagerAdapter adapter = new ViewPagerAdapter(
                getSupportFragmentManager(), dias, tits);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
