package ru.banana.andrew.gameroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VideogamesActivity extends AppCompatActivity {
    Videogame[] videogames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videogames);

        videogames = new Videogame[5];
        videogames[0] = new Videogame("Grand Theft Auto — мультиплатформенная видеоигра в жанре action и «открытый мир», разработанная компанией Rockstar North и изданная компанией Rockstar Games.","http://logos-download.com/6387-gta-grand-theft-auto-logo-download.html");
        videogames[1] = new Videogame("Battlefield — мультиплатформенная компьютерная игра в жанре шутера от первого лица, разрабатываемая компанией DICE и издаваемая Electronic Arts для платформ Windows, PlayStation 4 и Xbox One.","http://misculos.deviantart.com/art/BATTLEFIELD-logo-364485063");
        videogames[2] = new Videogame("Uncharted — серия компьютерных игр в жанре action-adventure, разработанных компанией Naughty Dog и изданных Sony Computer Entertainment для консолей PlayStation.","http://uncyclopedia.wikia.com/wiki/File:Uncharted_logo.png");
        videogames[3] = new Videogame("Mirror’s Edge — кроссплатформенная компьютерная игра в жанре приключенческого боевика и платформера от первого лица, разрабатываемая компанией DICE под издательством Electronic Arts", "http://ru.mirrorsedge.wikia.com/wiki/%D0%A4%D0%B0%D0%B9%D0%BB:Mirror's_Edge_logo.png");
        videogames[4] = new Videogame("Watch Dogs — мультиплатформенная компьютерная игра в жанре приключенческого боевика с открытым миром.Играя за хакера Вам предстоит взломать весь город и подчинить его себе.Игра была разработана компанией Ubisoft.","http://logonoid.com/watch-dogs-logo/");

        ListView listView = (ListView) findViewById(R.id.listView);
        int Layout = android.R.layout.simple_list_item_1;
        ArrayAdapter arrayAdapter = new VideogameAdapter(this, Layout,videogames);
        listView.setAdapter(arrayAdapter);

    }
}
