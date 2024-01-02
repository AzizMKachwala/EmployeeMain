package com.example.employeemain;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.employeemain.datamodels.AreaDataModel;
import com.example.employeemain.datamodels.CityDataModel;
import com.example.employeemain.datamodels.MemberDataModel;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    ViewPager2 viewPager2;
    List<MemberDataModel> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabMode);
        viewPager2 = findViewById(R.id.viewPager);

        dataModels = new ArrayList<>();

        for(int i=0; i<3; i++){

            CityDataModel model = new CityDataModel();
            model.setCityName("City "+ i);
            List<AreaDataModel> areaList = new ArrayList<>();
            for (int j=0;j<2;j++){
                AreaDataModel areaDataModel = new AreaDataModel();
                areaDataModel.setAreaName("Area Name "+ j);
                areaList.add(areaDataModel);

                List<MemberDataModel> memberList = new ArrayList<>();
                for (int k=0; k<3;k++){
                    MemberDataModel memberDataModel = new MemberDataModel();
                    memberDataModel.setMemberName("Member Name "+ k);
                    memberList.add(memberDataModel);
                }
                areaDataModel.setMemberLists(memberList);
                model.setAreaLists(areaList);
            }

        }

    }

    public class TabViewAdapter extends FragmentStateAdapter {

        public TabViewAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return new CityFragment(dataModels.get(position));
        }

        @Override
        public int getItemCount() {
            return dataModels.size();
        }
    }
}