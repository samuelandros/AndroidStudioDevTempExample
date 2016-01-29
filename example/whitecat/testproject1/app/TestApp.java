package com.example.whitecat.testproject1.app;

import android.app.Application;
import android.content.Context;

import com.example.whitecat.testproject1.BusProvider;

import org.androidannotations.annotations.EApplication;

@EApplication
public class TestApp extends Application{
    public static final boolean DEBUG = false;
    private static TestApp instance;

    public TestApp()
    {
        instance = this;
    }

    public static Context getAppContext()
    {
        return instance.getApplicationContext();
    }

    public static TestApp getInstance()
    {
        return instance;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        BusProvider.get().register(this);
    }
}
