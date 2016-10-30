package com.example.akasha.recycleviewmodule;

import android.support.annotation.LayoutRes;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by akashaarcher on 10/29/16.
 */

public class ViewPagerAdapter extends PagerAdapter {


    private String thumbnail;

    public ViewPagerAdapter(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = null;
        switch (position) {
            default:
            case 0:
                // inflate the first tab
                view = inflater.inflate(getLayout(thumbnail), container, false);
                break;

            case 1:
                view = inflater.inflate(R.layout.size_fragment, container, false);
                break;

            case 2:
                view = inflater.inflate(R.layout.form_fragment, container, false);
                break;
        }

        container.addView(view, position);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
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

    @LayoutRes
    int getLayout(String thumbnail) {
        switch (thumbnail) {
            default:
            case "Bronze":
                return R.layout.bronze_layout;
            case "Reptile":
                return R.layout.reptile_layout;
            case "Snake":
                return R.layout.snake_layout;
            case "Caliente":
                return R.layout.caliente_layout;
            case "Phoenix":
                return R.layout.phoenix_layout;
            case "Sizzle":
                return R.layout.sizzle_layout;
            case "Kuu":
                return R.layout.kuu_layout;
            case "Maisha":
                return R.layout.maisha_layout;
            case "Malkia":
                return R.layout.malkia_layout;
            case "Fountain":
                return R.layout.fountain_layout;
            case "Scarlet":
                return R.layout.scarlet_layout;
            case "Willow":
                return R.layout.willow_layout;
        }
    }
}
