package com.example.diksha.myapplication;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Home extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btn1 = (Button) findViewById(R.id.btn_snacks);
        Button btn2 = (Button) findViewById(R.id.btn_mains);
        Button btn3 = (Button) findViewById(R.id.btn_bev);
        Button btn4 = (Button) findViewById(R.id.btn_sides);
        String mystring;
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), Menu_Bar_try.class);
                i.putExtra("mystring", "0");
                startActivity(i);

                finish();
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), Menu_Bar_try.class);
                i.putExtra("mystring", "1");
                startActivity(i);

                finish();
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), Menu_Bar.class);
                i.putExtra("mystring", "2");
                startActivity(i);
               finish();
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), Menu_Bar.class);
                i.putExtra("mystring", "3");
                startActivity(i);

                finish();
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
