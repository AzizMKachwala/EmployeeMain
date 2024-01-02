package com.example.employeemain;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.employeemain.datamodels.MemberDataModel;

public class CityFragment extends Fragment {

    MemberDataModel memberDataModel;

    public CityFragment(MemberDataModel cityFragment) {
        this.memberDataModel = cityFragment;
    }

    public CityFragment(int contentLayoutId) {
        super(contentLayoutId);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_city, container, false);
        textView = view.findViewById(R.id.txtHome);

        return view;
    }
}