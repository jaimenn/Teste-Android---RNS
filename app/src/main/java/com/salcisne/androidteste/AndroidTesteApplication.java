package com.salcisne.androidteste;

import android.app.Application;

import com.salcisne.androidteste.service.api.ApiModule;

public class AndroidTesteApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        new ApiModule("http://11f02082c95c.ngrok.io/");
    }
}
