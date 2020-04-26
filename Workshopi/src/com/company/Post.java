package com.company;

import java.util.ArrayList;

public class Post extends Useri{

    private ArrayList<Reactions> reactions;
    private String description;
    private ArrayList<Comment> comments;
    private Photo photo;
    private ArrayList<Useri> taguserTags;

    public Post(){

    }

    public Post(ArrayList<Reactions> reactions, String description, ArrayList<Comment> comments, Photo photo, ArrayList<Useri> taguserTags) {
        this.reactions = reactions;
        this.description = description;
        this.comments = comments;
        this.photo = photo;
        this.taguserTags = taguserTags;
    }

    public ArrayList<Reactions> getReactions() {
        return reactions;
    }

    public void setReactions(ArrayList<Reactions> reactions) {
        this.reactions = reactions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public ArrayList<Useri> getTaguserTags() {
        return taguserTags;
    }

    public void setTaguserTags(ArrayList<Useri> taguserTags) {
        this.taguserTags = taguserTags;
    }
}
