package com.blogspot.nataliprograms.androidsamples.UI.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.blogspot.nataliprograms.androidsamples.R;

/**
 * Created by NataliLA on 3-1-17.
 */

public abstract class RecyclerBaseActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_recycler);

        mRecyclerView = (RecyclerView) findViewById(R.id.base_recyclerview_main);
        mRecyclerView.setAdapter(getRecyclerViewAdapter());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @NonNull
    protected abstract RecyclerView.Adapter getRecyclerViewAdapter();
}
