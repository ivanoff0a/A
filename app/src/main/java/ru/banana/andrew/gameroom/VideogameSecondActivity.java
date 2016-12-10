package ru.banana.andrew.gameroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

public class VideogameSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videogame_second);

        Videogame videogames = (Videogame) getIntent().getSerializableExtra("VIDEOGAME");
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(this).load(videogames.photo).fit().centerCrop().into(imageView);









    }

}
