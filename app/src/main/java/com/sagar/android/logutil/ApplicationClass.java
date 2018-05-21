package com.sagar.android.logutil;

import android.app.Application;

import com.sagar.android.logutilmaster.LogUtil;

public class ApplicationClass extends Application {
    LogUtil logUtil;

    @Override
    public void onCreate() {
        super.onCreate();

        initialiseLogUtil();
    }

    private void initialiseLogUtil() {
        LogUtil.Builder builder = new LogUtil.Builder()
                .setCustomLogTag("Custom_Log_Tag")
                .setShouldHideLogInReleaseMode(true, BuildConfig.DEBUG);
        logUtil = builder.build();
    }

    public LogUtil getLogUtil() {
        return logUtil;
    }
}
