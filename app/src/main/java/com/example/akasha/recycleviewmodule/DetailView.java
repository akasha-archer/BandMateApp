package com.example.akasha.recycleviewmodule;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.akasha.recycleviewmodule.sections.Caliente;
import com.example.akasha.recycleviewmodule.sections.Fountain;
import com.example.akasha.recycleviewmodule.sections.Kuu;
import com.example.akasha.recycleviewmodule.sections.Maisha;
import com.example.akasha.recycleviewmodule.sections.Malkia;
import com.example.akasha.recycleviewmodule.sections.Phoenix;
import com.example.akasha.recycleviewmodule.sections.Reptile;
import com.example.akasha.recycleviewmodule.sections.Scarlet;
import com.example.akasha.recycleviewmodule.sections.Sizzle;
import com.example.akasha.recycleviewmodule.sections.Snake;
import com.example.akasha.recycleviewmodule.sections.Willow;


public class DetailView extends AppCompatActivity {

    public static String COSTUME_NAME = "extra.costume.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_tab);

        String thumbnail = getIntent().getStringExtra(COSTUME_NAME);
        if(thumbnail!= null){
            switch (thumbnail) {
                case "Bronze":
                    showBronze();
                    break;
                case "Reptile":
                    showReptile();
                    break;
                case "Snake":
                    showSnake();
                    break;
                case "Caliente":
                    showCaliente();
                    break;
                case "Phoenix":
                    showPhoenix();
                    break;
                case "Sizzle":
                    showSizzle();
                    break;
                case "Kuu":
                    showKuu();
                    break;
                case "Maisha":
                    showMaisha();
                    break;
                case "Malkia":
                    showMalkia();
                    break;
                case "Fountain":
                    showFountain();
                    break;
                case "Scarlet":
                    showScarlet();
                    break;
                case "Willow":
                    showWillow();
                    break;
                default:
                    break;
            }
        }
    }


    private void showBronze(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Reptile());
        fragmentTransaction.commit();
    }

    private void showReptile(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Reptile());
        fragmentTransaction.commit();
    }

    private void showSnake(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Snake());
        fragmentTransaction.commit();
    }

    private void showCaliente(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Caliente());
        fragmentTransaction.commit();
    }

    private void showPhoenix(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Phoenix());
        fragmentTransaction.commit();
    }

    private void showSizzle(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Sizzle());
        fragmentTransaction.commit();
    }

    private void showKuu(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Kuu());
        fragmentTransaction.commit();
    }

    private void showMaisha(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Maisha());
        fragmentTransaction.commit();
    }

    private void showMalkia(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Malkia());
        fragmentTransaction.commit();
    }

    private void showFountain(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Fountain());
        fragmentTransaction.commit();
    }

    private void showScarlet(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Scarlet());
        fragmentTransaction.commit();
    }

    private void showWillow(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.costume_detail,new Willow());
        fragmentTransaction.commit();
    }


}
