package ru.banana.andrew.gameroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLogTags;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.attr.description;

public class VideogamesActivity extends AppCompatActivity {
    Videogame[] videogames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videogames);

        videogames = new Videogame[5];
        videogames[0] = new Videogame("Grand Theft Auto — мультиплатформенная видеоигра в жанре action и «открытый мир», разработанная компанией Rockstar North и изданная компанией Rockstar Games.","http://logos-download.com/wp-content/uploads/2016/05/GTA_logo_Grand_Theft_Auto.png");
        videogames[1] = new Videogame("Battlefield — мультиплатформенная компьютерная игра в жанре шутера от первого лица, разрабатываемая компанией DICE и издаваемая Electronic Arts для платформ Windows, PlayStation 4 и Xbox One.","http://orig14.deviantart.net/1577/f/2013/099/f/b/battlefield_logo_by_misculos-d6106h3.jpg");
        videogames[2] = new Videogame("Uncharted — серия компьютерных игр в жанре action-adventure, разработанных компанией Naughty Dog и изданных Sony Computer Entertainment для консолей PlayStation.","https://upload.wikimedia.org/wikipedia/fr/4/42/2013-Uncharted_Logo.png");
        videogames[3] = new Videogame("Mirror’s Edge — кроссплатформенная компьютерная игра в жанре приключенческого боевика и платформера от первого лица, разрабатываемая компанией DICE под издательством Electronic Arts", "http://www.logodesignblog.net/logos/mirrors-edge-logo.jpg");
        videogames[4] = new Videogame("Watch Dogs — мультиплатформенная компьютерная игра в жанре приключенческого боевика с открытым миром.Играя за хакера Вам предстоит взломать весь город и подчинить его себе.Игра была разработана компанией Ubisoft.","http://www.logosurfer.com/sites/default/files/styles/large/public/watch-dogs-logo_0.png?itok=8xCQ1ohm");

        ListView listView = (ListView) findViewById(R.id.listView);
        int Layout = android.R.layout.simple_list_item_1;
        ArrayAdapter arrayAdapter = new VideogameAdapter(this, Layout,videogames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Videogame choosengame = videogames[position];


                Intent intent = new Intent(VideogamesActivity.this,VideogameSecondActivity.class);
                intent.putExtra("VIDEOGAME", choosengame);
                startActivity(intent);


            }
        });

    }

}
