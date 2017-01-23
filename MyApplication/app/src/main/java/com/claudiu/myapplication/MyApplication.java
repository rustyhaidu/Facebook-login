package com.claudiu.myapplication;

/**
 * Created by Claudiu on 1/23/2017.
 */

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import static com.facebook.FacebookSdk.getApplicationContext;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
