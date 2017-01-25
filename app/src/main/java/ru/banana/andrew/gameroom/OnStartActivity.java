package ru.banana.andrew.gameroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class OnStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_start);

        View bigLayout = findViewById(R.id.activity_on_start);
        bigLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(OnStartActivity.this, VideogamesActivity.class);
            startActivity(intent);
                finish();
            }
        });
        Animation start1TextViewAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        start1TextViewAnimation.setDuration(600);
        TextView start1TextView = (TextView) findViewById(R.id.tv);
        start1TextView.startAnimation(start1TextViewAnimation);

        Animation start2TextViewAnimation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        start2TextViewAnimation.setDuration(600);
        start2TextViewAnimation.setStartOffset(200);
        TextView start2TextView = (TextView) findViewById(R.id.tv2);
        start2TextView.startAnimation(start2TextViewAnimation);







    }
}
