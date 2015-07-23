package com.example.diksha.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Address extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_address, null);
//        Button button = (Button) view.findViewById(R.id.hbutton1);
//        button.setText("horizontal");
//        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
//        String[] items = new String[]{"1", "2", "three"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
//        dropdown.setAdapter(adapter);
        return view;
    }
}
