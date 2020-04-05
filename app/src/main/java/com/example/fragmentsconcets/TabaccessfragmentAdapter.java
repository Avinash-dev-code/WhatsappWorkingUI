package com.example.fragmentsconcets;

import android.icu.text.CaseMap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerTitleStrip;

public class TabaccessfragmentAdapter extends FragmentPagerAdapter

{
    public TabaccessfragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BlankFragment blankFragment=new BlankFragment();
                return blankFragment;


            case 1:
                BlankFragment2 blankFragment2=new BlankFragment2();
                return blankFragment2;

            case 2:
                BlankFragment3 blankFragment3=new BlankFragment3();
                return blankFragment3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch(position){
            case 0:

               return "Camera";

            case 1:

                return "Chats";

            case 2:
                return "Status";
            default:
                return null;
        }

    }
}
