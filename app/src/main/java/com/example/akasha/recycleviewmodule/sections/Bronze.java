package com.example.akasha.recycleviewmodule.sections;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akasha.recycleviewmodule.R;

/**
 * Created by akashaarcher on 10/28/16.
 */

public class Bronze extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       return inflater.inflate(R.layout.bronze_layout, container, false);
    }
}
