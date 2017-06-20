package com.amarpreetsinghprojects.newprojectmail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kulvi on 06/20/17.
 */

public class FragmentDetails extends Fragment {

    public static FragmentDetails newInstance(String name, String date, Integer age, String course) {
        
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putInt("age",age);
        args.putString("date",date);
        args.putString("course",course);
        FragmentDetails fragment = new FragmentDetails();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_details,container,false);

        ((TextView)v.findViewById(R.id.fragment_name)).setText(getArguments().getString("name"));
        ((TextView)v.findViewById(R.id.fragment_age)).setText(""+getArguments().getInt("age"));
        ((TextView)v.findViewById(R.id.fragment_date)).setText(getArguments().getString("date"));
        ((TextView)v.findViewById(R.id.fragment_course)).setText(getArguments().getString("course"));

        return v;
    }
}
