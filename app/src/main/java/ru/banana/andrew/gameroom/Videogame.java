package ru.banana.andrew.gameroom;

import java.io.Serializable;

/**
 * Created by User on 03.12.2016.
 */
public class Videogame implements Serializable {
    String description;
    String photo;
    String screenshot;
    String title;
    String screenshot2;
    String screenshot3;
    String trailer;


    Videogame(String description, String photo,String screenshot, String title, String screenshot2, String screenshot3,String trailer) {
        this.description = description;
        this.photo = photo;
        this.screenshot = screenshot;
        this.title = title;
        this.screenshot2 = screenshot2;
        this.screenshot3 = screenshot3;
        this.trailer = trailer;
    }
}
