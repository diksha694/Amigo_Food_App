package com.example.diksha.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;

public class OrderStatus extends Activity {
    TextView tv;
    ProgressBar pBar;
    int pStatus = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status);
        tv = (TextView) findViewById(R.id.textView3);
        pBar = (ProgressBar) findViewById(R.id.progressBar1);

        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while (pStatus <= 100) {

                    handler.post(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            pBar.setProgress(pStatus);
                            pBar.setSecondaryProgress(100);
                            if(pStatus==0)
                            {
                                tv.setText("Order Accepted!!");
                            }
                            if(pStatus==33)
                            {
                                tv.setText("Cooking!!");
                            }
                            if(pStatus==66)
                            {
                                tv.setText("Ready for Delievery!!");
                            }
                            if(pStatus==100)
                            {
                                tv.setText("Delievered!!");
                            }

                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        // Just to display the progress slowly
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pStatus++;
                }
            }
        }).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
