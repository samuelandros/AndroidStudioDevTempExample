package com.example.whitecat.testproject1.prefs;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref(value=SharedPref.Scope.UNIQUE)
public interface AppData {
    /* settings */
    @DefaultBoolean(true) boolean isFirstLaunch();

    int numberOfLaunch();
}

