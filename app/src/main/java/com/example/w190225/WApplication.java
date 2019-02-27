package com.example.w190225;

import android.app.Application;
import android.util.Log;

import com.squareup.otto.Bus;

public class WApplication extends Application {
    private static final String TAG = "WApplication";
    private static WApplication instance = null;
    private Bus bus = new Bus();

    public static WApplication getInstance() {
        return instance; // Singleton
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "WApplication.onCreate()");
        // Salva a instância para termos acesso como Singleton
        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "WApplication.onTerminate()");
    }

    public Bus getBus() {
        return bus;
    }
}
