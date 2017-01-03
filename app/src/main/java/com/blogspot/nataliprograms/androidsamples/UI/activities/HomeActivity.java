package com.blogspot.nataliprograms.androidsamples.UI.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.blogspot.nataliprograms.androidsamples.R;

/**
 * Created by NataliLA on 2-1-17.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goButtonAction(android.view.View view){
        startActivity(new Intent(this, CategoriesActivity.class));
        finish();
    }
}
