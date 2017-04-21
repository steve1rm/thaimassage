package me.androidbox.thaimassage.login.di;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by steve on 4/22/17.
 */

public class ThaiMassageApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
