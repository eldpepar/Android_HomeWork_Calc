package com.example.code_16.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.code_16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Device extends Fragment {


    public Fragment_Device() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment__device, container, false);
    }

}