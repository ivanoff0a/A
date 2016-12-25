package ru.banana.andrew.gameroom;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.EventLogTags;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
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
        videogames[0] = new Videogame("Grand Theft Auto — мультиплатформенная видеоигра в жанре action и «открытый мир», разработанная компанией Rockstar North и изданная компанией Rockstar Games.", "http://www.dlcompare.com/upload/gameimage/file/7337.jpeg", "http://www.gtafans.ru/sites/default/files/imagepicker/1/gta-5-screenshots-36.jpg", "Grand Theft Auto", "https://img.gta5-mods.com/q95/images/ford-mustang-1965-hoonicorn-add-on/e868af-GTA5%202016-04-16%2019-26-14-88.jpg", "http://static1.gamespot.com/uploads/original/123/1239113/2861382-gta5.jpg"," https://github.com/kuelye/a.banana/raw/master/temp/Grand%20Theft%20Auto%20V%20Trailer.mp4");
        videogames[1] = new Videogame("Battlefield — мультиплатформенная компьютерная игра в жанре шутера от первого лица, разрабатываемая компанией DICE и издаваемая Electronic Arts для платформ Windows, PlayStation 4 и Xbox One.", "http://orig14.deviantart.net/1577/f/2013/099/f/b/battlefield_logo_by_misculos-d6106h3.jpg", "https://content.pulse.ea.com/content/battlefield-portal/ru_RU/news/battlefield-1/road-to-battlefield-stream/_jcr_content/featuredImage/renditions/rendition1.img.jpg", "Battlefield", "https://data2.origin.com/live/content/dam/originx/web/app/games/battlefield/battlefield-1/screenshots/battlefield-1/BF1_se_screenhi_930x524_en_US_behemoth_v1.jpg", "https://content.pulse.ea.com/content/battlefield-portal/en_US/news/battlefield-1/the-single-player-of-battlefield-1/_jcr_content/featuredImage/renditions/rendition1.img.jpg", "");
        videogames[2] = new Videogame("Uncharted — серия компьютерных игр в жанре action-adventure, разработанных компанией Naughty Dog и изданных Sony Computer Entertainment для консолей PlayStation.", "http://www.allkeyshop.com/blog/wp-content/uploads/uncharted_4_banner.jpg", "http://uwrena.ru/wp-content/uploads/2016/05/93vxrh1u.jpg", "Uncharted", "http://virtualgameinfo.ru/wp-content/uploads/2016/05/Uncharted-4-brothers-adventure-last-drake.jpeg", "https://i.kinja-img.com/gawker-media/image/upload/s---0e1tU1k--/c_scale,f_auto,fl_progressive,q_80,w_800/tit8ia9em5b8meb5pz4t.png", "https://www.youtube.com/watch?v=yMMzkBrw7IU");
        videogames[3] = new Videogame("Mirror’s Edge — кроссплатформенная компьютерная игра в жанре приключенческого боевика и платформера от первого лица, разрабатываемая компанией DICE под издательством Electronic Arts", "http://www.logodesignblog.net/logos/mirrors-edge-logo.jpg", "http://www.straight.com/files/v3/images/15/06/eai9dmaeudbz.878x0.z-z96kyq.jpg", "Mirorr's Edge", "https://cdn0.vox-cdn.com/thumbor/b03uJ3qJzCY_ZjOcysUasxvLMCQ=/cdn0.vox-cdn.com/uploads/chorus_asset/file/6599375/Mirrors-edge-catalyst_Launch_Screen_06_BlackNovember_WM.0.jpg", "http://gearburn.sndytsvoxozgokstuvcm.netdna-cdn.com/wp-content/uploads/2016/08/Mirrors-Edge-Catalyst-review-6.jpg", "https://www.youtube.com/watch?v=voyTlZ1nInU");
        videogames[4] = new Videogame("Watch Dogs — мультиплатформенная компьютерная игра в жанре приключенческого боевика с открытым миром.Играя за хакера Вам предстоит взломать весь город и подчинить его себе.Игра была разработана компанией Ubisoft.", "https://jbhnews.com/wp-content/uploads/2016/11/watch-dogs-2-600x338.jpg", "http://assets1.ignimgs.com/thumbs/userUploaded/2016/6/8/watchdogsthumb2-1465405447883_large.jpg", "Watch_Dogs", "https://alogvinov.com/wp-content/uploads/2016/10/Watch-Dogs-2.jpg", "http://www.game-ost.ru/static/content/2016/11/09/4952_715327.jpg","https://www.youtube.com/watch?v=eVVNXwuf_yU");

        GridView gridView = (GridView) findViewById(R.id.GridView);
        int Layout = android.R.layout.simple_list_item_1;
        ArrayAdapter arrayAdapter = new VideogameAdapter(this, Layout, videogames);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Videogame choosengame = videogames[position];


                Intent intent = new Intent(VideogamesActivity.this, VideogameSecondActivity.class);
                intent.putExtra("VIDEOGAME", choosengame);
                startActivity(intent);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // создаём меню
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu , menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case(R.id.sort_item) :
                Intent intent = new Intent(VideogamesActivity.this, AboutCompanyActivity.class);
                startActivity(intent);


                return true;
            default:
                return true;
        }
    }
}
