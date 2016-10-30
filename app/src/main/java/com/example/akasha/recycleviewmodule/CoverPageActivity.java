package com.example.akasha.recycleviewmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by akashaarcher on 10/28/16.
 */

public class CoverPageActivity extends AppCompatActivity implements View.OnClickListener {

    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cover_page);

        Button enter = (Button) findViewById(R.id.enter_btn);
       enter.setOnClickListener(CoverPageActivity.this);
    }

    @Override
    public void onClick(View view) {
        Intent newIntent = new Intent(CoverPageActivity.this, MainActivity.class);
        startActivity(newIntent);

    }
}
