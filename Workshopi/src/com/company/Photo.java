package com.company;

public class Photo extends Album {
    //id, imageUrl,name,des
    private int photoID;
    private String imageURL;
    private String name;
    private String description;

    public Photo(){

        //super(printo, printo);
    }



    public Photo(int photoID, String imageURL, String name, String description) {
        //super(printo, printo);
        this.photoID = photoID;
        this.imageURL = imageURL;
        this.name = name;
        this.description = description;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
