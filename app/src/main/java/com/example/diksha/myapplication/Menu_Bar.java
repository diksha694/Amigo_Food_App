package com.example.diksha.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TabHost;
import android.widget.ViewFlipper;


public class Menu_Bar extends TabActivity {


    

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__bar);


// create the TabHost that will contain the Tabs
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("Snacks");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Mains");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("Beverages");
        TabHost.TabSpec tab4 = tabHost.newTabSpec("Sides");




        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("Snacks");
        tab1.setContent(new Intent(this, Snacks.class));

        tab2.setIndicator("Mains");
        tab2.setContent(new Intent(this, Mains.class));

        tab3.setIndicator("Beverages");
        tab3.setContent(new Intent(this, Beverages.class));

        tab4.setIndicator("Sides");
        tab4.setContent(new Intent(this, Sides.class));

     /*   Bundle extras = getIntent().getExtras();

        String value = null;
        if (extras != null) {
            value = extras.getString("mystring");
        }*/


        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);


      //  tabHost.setCurrentTab(Integer.parseInt(value));


    }



}
