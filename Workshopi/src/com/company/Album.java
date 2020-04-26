package com.company;

import java.util.ArrayList;

public class Album extends Post{
    private int photoCounter;
    //private Photo photos;
    private ArrayList<Photo> photos;

    public Album(){

    }
    public Album(int photoCounter, Photo photos) {
        this.photoCounter = photoCounter;

    }

    public int getPhotoCounter() {
        return photoCounter;
    }

    public void setPhotoCounter(int photoCounter) {
        this.photoCounter = photoCounter;
    }

//    public static void add(int photoCounter) {
//        Album item = new Album(photoCounter);
//        Album.add(item);
//    }

}
