package ru.banana.andrew.gameroom;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.squareup.picasso.Picasso;

import static ru.banana.andrew.gameroom.R.id.imageView;


public class AboutCompanyActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_company);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.left);
        actionBar.setTitle("О компании");

        imageView = (ImageView) findViewById(R.id.imageView);
        animateImageView();
    }

    private void animateImageView() {
        Animator.AnimatorListener listener = new Animator.AnimatorListener() {

            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                animateImageView();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        };

        imageView.animate().setDuration(500).setStartDelay(1000)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .rotation(imageView.getRotation() + 90)
                .setListener(listener).start();
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return true;
    }
}
























