package ru.banana.andrew.gameroom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by BananaAdmin on 07.12.2016.
 */

public class VideogameAdapter extends ArrayAdapter {

    public VideogameAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.videogame_item, parent, false);

        Videogame videogame = (Videogame) getItem(position);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        Picasso.with(getContext()).load(videogame.photo).fit().centerCrop().into(imageView);


        return view;
    }

}
