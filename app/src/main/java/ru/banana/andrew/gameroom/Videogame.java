package ru.banana.andrew.gameroom;

import java.io.Serializable;

/**
 * Created by User on 03.12.2016.
 */
public class Videogame implements Serializable {
    String description;
    String photo;
    String screenshot;


    Videogame(String description, String photo,String screenshot) {
        this.description = description;
        this.photo = photo;
        this.screenshot = screenshot;
    }


}
