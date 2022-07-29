package com.sagar.android.logutil

import android.app.Application

import com.sagar.android.logutilmaster.LogUtil

class ApplicationClass : Application() {
    lateinit var logUtil: LogUtil

    override fun onCreate() {
        super.onCreate()

        initialiseLogUtil()
    }

    private fun initialiseLogUtil() {
        val builder = LogUtil.Builder()
            .setCustomLogTag("Custom_Log_Tag")
            .setShouldHideLog(false)
        logUtil = builder.build()
    }
}
