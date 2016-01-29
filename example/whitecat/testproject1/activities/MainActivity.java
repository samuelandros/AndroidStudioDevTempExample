package com.example.whitecat.testproject1.activities;

import android.content.Intent;
import android.support.annotation.UiThread;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.whitecat.testproject1.R;
import com.example.whitecat.testproject1.app.TestApp;
import com.example.whitecat.testproject1.prefs.AppData_;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.annotations.App;

@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @App
    TestApp mApp;

    @Pref
    AppData_ mAppdata;

    Drawer mLeftDrawer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(mAppdata.isFirstLaunch().get() == true) {
            startActivity(new Intent(this, TutorialActivity_.class));
        }
        mAppdata.isFirstLaunch().put(false);
    }

    @AfterViews
    void initViews()
    {
        mLeftDrawer = new DrawerBuilder().withActivity(this).build();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }
}
