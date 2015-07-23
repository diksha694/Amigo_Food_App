package com.example.diksha.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class UserCred extends FragmentActivity {

    private boolean flip = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_cred);
        //  setStyle(STYLE_NO_FRAME, android.R.style.Theme_Holo_Light);

        PhoneNum fv = new PhoneNum();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.layoutToReplace, fv);
        ft.commit();


        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!flip) {
                    Address fh = new Address();

                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.layoutToReplace, fh);
                    ft.commit();
                    flip = true;
                } else {
                    //PhoneNum fv = new PhoneNum();
//                    Intent intent = new Intent(getActivity(), OrderStatus.class);
//                    startActivity(intent);
//                    FragmentManager fm = getFragmentManager();
//                    FragmentTransaction ft = fm.beginTransaction();
//                    ft.replace(R.id.layoutToReplace, fv);
//                    ft.commit();
//                    flip = false;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
