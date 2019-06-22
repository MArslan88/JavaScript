package com.example.order;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter{
    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        // we get the Position of the fragments by using switch statement
        switch (i){
            case 0:
                PizzaFragment pizzaFragment = new PizzaFragment();
                return pizzaFragment;

            case 1:
                StartersFragment startersFragment = new StartersFragment();
                return startersFragment;

            case 2:
                DealsFragment dealsFragment = new DealsFragment();
                return dealsFragment;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    // method to set the title for the Fragments

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // we get the Position of the fragments by using switch statement
        switch (position){
            case 0:
                return "Pizza";

            case 1:
                return "Starters";

            case 2:
                return "Deals";

            default:
                return null;
        }
    }
}
