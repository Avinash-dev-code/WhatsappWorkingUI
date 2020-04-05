package com.example.fragmentsconcets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar mtoolbar;
    private ViewPager mView;
    private TabLayout mtab;
  private  TabaccessfragmentAdapter tabaccessfragmentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtab=(TabLayout)findViewById(R.id.Tablayout);
        mView=(ViewPager)findViewById(R.id.ViewPager);
        mtoolbar=(Toolbar)findViewById(R.id.Toolbar);






         mView=(ViewPager)findViewById(R.id.ViewPager);
         tabaccessfragmentAdapter =new TabaccessfragmentAdapter(getSupportFragmentManager());
         mView.setAdapter(tabaccessfragmentAdapter);
         mtab.setupWithViewPager(mView);





    }


}
