package ru.banana.andrew.gameroom;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutCompanyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_company);

        //ImageView imageView = (ImageView) findViewById(R.id.ImageView2);
        //Picasso.with(this).load(https://hh.ru/employer-tab-picture-resized/162341.png).fit().centerCrop().into(imageView2);

        // заполняем активность
        // - иконку
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //actionBar.setHomeAsUpIndicator(R.drawable.);
        // - заголовок и подзаголовок тулбара
        actionBar.setTitle("О компании");
        // - информация об авторе



    }
}