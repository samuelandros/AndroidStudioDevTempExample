package com.example.whitecat.testproject1.fragments.tutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Click;
import android.util.*;

import com.example.whitecat.testproject1.R;

@EFragment(R.layout.fragment_tutorial_page3)
public class TutorialPage3Fragment extends Fragment {


    public TutorialPage3Fragment() {
        // Required empty public constructor
    }

    @Click(R.id.btnTutorial3) void onBtnTutorial3() {
        Log.d("TestProject", "Tutorial Page3 button is clicked.");
        getActivity().finish();
    }

}
