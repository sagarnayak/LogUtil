package com.sagar.android.logutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((ApplicationClass)getApplicationContext()).getLogUtil().logD("Test debug log.");
        ((ApplicationClass)getApplicationContext()).getLogUtil().logD("CustomDebugTag","Test log with ");
    }
}
