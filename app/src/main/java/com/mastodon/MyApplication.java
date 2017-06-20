package com.mastodon;

import android.app.Application;

import com.mastodon.Preferences.SharedPreferencesHelper;

public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        SharedPreferencesHelper.getInstance().setInstallationTime(System.currentTimeMillis());
    }

    public static MyApplication getInstance() {
        return instance;
    }
}