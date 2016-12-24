package ru.banana.andrew.gameroom;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.ravenfeld.easyvideoplayer.EasyVideoCallback;
import com.ravenfeld.easyvideoplayer.EasyVideoPlayer;
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

        EasyVideoPlayer player = (EasyVideoPlayer) findViewById(R.id.player);
        ViewGroup videoPlayerContainer = (ViewGroup) findViewById(R.id.content_easy_video_player);
        if (videogames.trailer == null) {
            videoPlayerContainer.setVisibility(View.GONE);
        } else {
            videoPlayerContainer.setVisibility(View.VISIBLE);
            player.setCallback(new EasyVideoCallback() {
                // stub
            });
            player.setSource(Uri.parse(videogames.trailer));
        }
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











