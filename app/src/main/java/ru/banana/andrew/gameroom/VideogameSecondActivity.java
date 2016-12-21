package ru.banana.andrew.gameroom;

import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

import static ru.banana.andrew.gameroom.R.id.textView;

public class VideogameSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videogame_second);

        Videogame videogames = (Videogame) getIntent().getSerializableExtra("VIDEOGAME");
        ImageView imageView = (ImageView) findViewById(R.id.ImageView1);
        Picasso.with(this).load(videogames.photo).fit().into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.ImageView2);
        Picasso.with(this).load(videogames.screenshot).fit().centerCrop().into(imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.ImageView3);
        Picasso.with(this).load(videogames.screenshot2).fit().centerCrop().into(imageView3);

        ImageView imageView1 = (ImageView) findViewById(R.id.ImageView1);
        Picasso.with(this).load(videogames.screenshot3).fit().centerCrop().into(imageView);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(videogames.description);

        ImageView wikiimage = (ImageView) findViewById(R.id.imageView);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.mipmap.ic_arrow);
        actionBar.setTitle(videogames.title);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return true;
    }

}











