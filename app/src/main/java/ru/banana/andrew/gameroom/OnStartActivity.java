package ru.banana.andrew.gameroom;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

import static android.R.id.content;

public class OnStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_start);

        try{
        String[] strings = new String[1000000000];
        for (int i = 0; i < 1000000000; ++i) {
            strings[i] = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        }
    }catch(OutOfMemoryError e){
        Log.w("Error", e.toString());

    }



        View bigLayout = findViewById(R.id.activity_on_start);
        bigLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnStartActivity.this, VideogamesActivity.class);
                startActivity(intent);
                finish();
            }
        });
        //Animation start1TextViewAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        //start1TextViewAnimation.setDuration(800);
        //TextView start1TextView = (TextView) findViewById(R.id.tv);
        //start1TextView.startAnimation(start1TextViewAnimation);

        //Animation start2TextViewAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        //start2TextViewAnimation.setDuration(800);
        //start2TextViewAnimation.setStartOffset(200);
        //TextView start2TextView = (TextView) findViewById(R.id.tv2);
        //start2TextView.startAnimation(start2TextViewAnimation);

        //TextView startTV = (TextView) findViewById(R.id.tv2);
        //startTV.animate().rotation(360*5).setDuration(4000).scaleX(10).scaleY(10).start();
        //TextView startTV2 = (TextView) findViewById(R.id.tv);
        //startTV2.animate().rotation(360*5).setDuration(4000).scaleX(5).scaleY(5).translationY(delta).start();
        //new AccelerateDecelerateInterpolator()
        //new BounceInterpolator()
        //new OvershootInterpolator()
        //new CycleInterpolator()
        //new LinearInterpolator()
        //new FastOutSlowInInterpolator()
        //new FastOutLinearInInterpolator()
        TextView start1TextView = (TextView) findViewById(R.id.tv2);
        int delta = dpToPixels(this, 513);
        start1TextView.animate().translationY(delta).setDuration(3000).setInterpolator(new BounceInterpolator()).start();
        TextView start2TextView = (TextView) findViewById(R.id.tv);
        int delta2 = dpToPixels(this,454);
        start2TextView.animate().setStartDelay(3500).alpha(300).translationY(delta2).setDuration(2000).setInterpolator(new BounceInterpolator()).start();
    }

    public static int dpToPixels(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }






}



