package com.example.diksha.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements AnimationListener {

    TextView txtMessage;
    Button btnStart;
ImageView imgView;
    // Animation
    Animation animFadein;
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //txtMessage = (TextView) findViewById(R.id.txtMessage);
        //btnStart = (Button) findViewById(R.id.btnStart);
        imgView = (ImageView) findViewById(R.id.imageView);
        imgView.setScaleType(ImageView.ScaleType.FIT_XY);
        // load the animation
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom);

        // set animation listener
        animFadein.setAnimationListener(this);
        imgView.setVisibility(View.VISIBLE);

        // start the animation
        imgView.startAnimation(animFadein);
        // button click event
       /* btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                imgView.setVisibility(View.VISIBLE);

                // start the animation
               imgView.startAnimation(animFadein);
            }
        });*/
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(MainActivity.this, Slideshow.class);
                startActivity(i);




                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}