package ru.banana.andrew.gameroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

public class VideogameSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videogame_second);

        Videogame videogames = (Videogame) getIntent().getSerializableExtra("VIDEOGAME");
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        Picasso.with(this).load(videogames.photo).fit().centerCrop().into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
        Picasso.with(this).load(videogames.photo).fit().centerCrop().into(imageView);


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(videogames.description);

    }
}











