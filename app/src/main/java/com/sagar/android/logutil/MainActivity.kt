package com.sagar.android.logutil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        (applicationContext as ApplicationClass).logUtil.logD("Test debug log.")
        (applicationContext as ApplicationClass).logUtil.logD("CustomDebugTag", "Test log with ")
    }
}
