package ru.banana.andrew.gameroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLogTags;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import static android.R.attr.description;

public class VideogamesActivity extends AppCompatActivity {
    Videogame[] videogames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videogames);

        videogames = new Videogame[5];
        videogames[0] = new Videogame("Grand Theft Auto — мультиплатформенная видеоигра в жанре action и «открытый мир», разработанная компанией Rockstar North и изданная компанией Rockstar Games.","http://www.dlcompare.com/upload/gameimage/file/7337.jpeg", "http://www.gtafans.ru/sites/default/files/imagepicker/1/gta-5-screenshots-36.jpg", "Grand Theft Auto", "https://ubistatic9-a.akamaihd.net/resource/ru-RU/game/watchdogs/watchdogs/WD2_SC4_E3_Parkour_256166.jpg", "https://games.mail.ru/pre_highlight_crop/pic/pc/gallery/6f/da/watch_dogs_2_784aca90.jpeg", "http://www.gameawards.ru/userfiles/715-34c6208632ade31b72347b380b577d42.jpg");
        videogames[1] = new Videogame("Battlefield — мультиплатформенная компьютерная игра в жанре шутера от первого лица, разрабатываемая компанией DICE и издаваемая Electronic Arts для платформ Windows, PlayStation 4 и Xbox One.","http://orig14.deviantart.net/1577/f/2013/099/f/b/battlefield_logo_by_misculos-d6106h3.jpg", "https://content.pulse.ea.com/content/battlefield-portal/ru_RU/news/battlefield-1/road-to-battlefield-stream/_jcr_content/featuredImage/renditions/rendition1.img.jpg", "Battlefield", "https://i.ytimg.com/vi/4pY3hlQEOc0/maxresdefault.jpg", "https://data2.origin.com/live/content/dam/originx/web/app/games/battlefield/battlefield-1/screenshots/battlefield-1/1038423_screenhi_930x524_en_ww_blaster_v1.jpg,", "http://u.kanobu.ru/screenshots/92/01f38d62-e3fc-46ec-85cb-83071e84821a.jpg");
        videogames[2] = new Videogame("Uncharted — серия компьютерных игр в жанре action-adventure, разработанных компанией Naughty Dog и изданных Sony Computer Entertainment для консолей PlayStation.","http://www.allkeyshop.com/blog/wp-content/uploads/uncharted_4_banner.jpg","http://uwrena.ru/wp-content/uploads/2016/05/93vxrh1u.jpg", "Uncharted", "http://disgustingmen.com/wp-content/uploads/2016/05/Uncharted-4-shooting.jpg", "http://beltion-game.com/wp-content/uploads/2016/06/Uncharted-4-Chapter-14-03.jpg", "https://i.ytimg.com/vi/9y1cNkiMmgY/maxresdefault.jpg");
        videogames[3] = new Videogame("Mirror’s Edge — кроссплатформенная компьютерная игра в жанре приключенческого боевика и платформера от первого лица, разрабатываемая компанией DICE под издательством Electronic Arts", "http://www.logodesignblog.net/logos/mirrors-edge-logo.jpg", "http://www.straight.com/files/v3/images/15/06/eai9dmaeudbz.878x0.z-z96kyq.jpg", "Mirorr's Edge");
        videogames[4] = new Videogame("Watch Dogs — мультиплатформенная компьютерная игра в жанре приключенческого боевика с открытым миром.Играя за хакера Вам предстоит взломать весь город и подчинить его себе.Игра была разработана компанией Ubisoft.","https://jbhnews.com/wp-content/uploads/2016/11/watch-dogs-2-600x338.jpg", "http://assets1.ignimgs.com/thumbs/userUploaded/2016/6/8/watchdogsthumb2-1465405447883_large.jpg", "Watch_Dogs");

        GridView gridView = (GridView) findViewById(R.id.GridView);
        int Layout = android.R.layout.simple_list_item_1;
        ArrayAdapter arrayAdapter = new VideogameAdapter(this, Layout,videogames);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
