package com.example.whitecat.testproject1.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.ViewById;


import com.example.whitecat.testproject1.R;
import com.example.whitecat.testproject1.fragments.tutorial.*;

@EActivity(R.layout.activity_tutorial)
public class TutorialActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{

    @ViewById(R.id.tutorialViewPager)
    ViewPager tutorialViewPager;

    FragmentPagerAdapter mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            switch(position)
            {
                case 0:
                    return TutorialPage1Fragment_.builder().build();
                case 1:
                    return TutorialPage2Fragment_.builder().build();
                case 2:
                    return TutorialPage3Fragment_.builder().build();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    };


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        /* no op*/
    }

    @Override
    public void onPageSelected(int position) {
        Log.d("TestProject", "ViewPager onPageSelected is called.");
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        /* no op*/
    }

    @AfterViews
    void initViews()
    {
        tutorialViewPager.setEnabled(true);
        tutorialViewPager.setAdapter(mAdapter);
        tutorialViewPager.setOnPageChangeListener(this);
    }
}
