package com.sagar.android.logutil

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.sagar.android.logutilmaster.LogLevel
import com.sagar.android.logutilmaster.LogUtilContract

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        (applicationContext as ApplicationClass).logUtil.registerForCallback(
                object : LogUtilContract {
                    override fun logged(message: String, logLevel: LogLevel, logTag: String) {
                        Log.v("log_util_call_back", ">> $message >> $logTag")
                    }
                }
        )

        (applicationContext as ApplicationClass).logUtil.logD("Test debug log.")
        (applicationContext as ApplicationClass).logUtil.logD("CustomDebugTag", "Test log with ")
    }
}
