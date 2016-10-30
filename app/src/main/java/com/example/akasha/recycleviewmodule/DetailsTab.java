package com.example.akasha.recycleviewmodule;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.akasha.recycleviewmodule.sections.Bronze;

import static com.example.akasha.recycleviewmodule.DetailView.COSTUME_NAME;

/**
 * Created by akashaarcher on 10/28/16.
 */

public class DetailsTab extends AppCompatActivity {
    
    TabLayout tabLayout;
    ViewPager viewPager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_tab);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        String thumbnail = getIntent().getStringExtra(COSTUME_NAME);

//        viewPager.setAdapter(new DetailAdapter(getSupportFragmentManager(), getApplicationContext()));

        viewPager.setAdapter(new ViewPagerAdapter(thumbnail));
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
        });

    }

    private class DetailAdapter extends FragmentPagerAdapter {

        public DetailAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new Bronze();

                case 1:
                    return new SizeFragment();

                case 2:
                    return new FormFragment();

                default:
                    return null;

            }
        }

        @Override
        public int getCount() {
            return 3;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "DETAIL";

                case 1:
                    return "SIZES";

                case 2:
                    return "ORDER FORM";

                default:
                    return null;

            }
        }
    }
}
