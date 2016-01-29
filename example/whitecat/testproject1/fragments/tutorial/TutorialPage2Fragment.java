package com.example.whitecat.testproject1.fragments.tutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Click;
import android.util.*;


import com.example.whitecat.testproject1.R;

@EFragment(R.layout.fragment_tutorial_page2)
public class TutorialPage2Fragment extends Fragment {


    public TutorialPage2Fragment() {
        // Required empty public constructor
    }

    @Click(R.id.btnTutorial2) void onBtnTutorial2() {
        Log.d("TestProject", "Tutorial Page 2 button is clicked");
    }
}
