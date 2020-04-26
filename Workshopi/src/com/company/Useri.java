package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Useri extends Person {


    private String education;
    private String workplace;
    private String hometown;
    private RelationshipStatus status;
    private LocalDate accountCreated;
    private int mosha;

    public Useri(){


    }

    public Useri(String name, String middleName, String surname, LocalDate birthday, String email, String education, String workplace, String hometown, RelationshipStatus status, LocalDate accountCreated, int mosha, ArrayList<Useri> friendsList) {
        super(name, middleName, surname, birthday, email);
        this.education = education;
        this.workplace = workplace;
        this.hometown = hometown;
        this.status = status;
        this.accountCreated = accountCreated;
        this.mosha = mosha;
        this.friendsList = friendsList;
    }

    public Useri(String name, String surname) {
    }


    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public RelationshipStatus getStatus() {
        return status;
    }

    public void setStatus(RelationshipStatus status) {
        this.status = status;
    }

    public LocalDate getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(LocalDate accountCreated) {
        this.accountCreated = accountCreated;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public int getMAX_FRIENDS() {
        return MAX_FRIENDS;
    }

    public ArrayList<Useri> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(ArrayList<Useri> friendsList) {
        this.friendsList = friendsList;
    }

        private ArrayList<Album> albums;
        private ArrayList<Post> posts;

        public void createPost(String description) {
            Post p = new Post();
            p.setDescription(description);
            posts.add(p);
        }


        public final int MAX_FRIENDS = 5000;

        private ArrayList<Useri> friendsList;

    public void addFrind(Useri newFriend) {
        if(friendsList.size()<MAX_FRIENDS)
            friendsList.add(newFriend);
        else {
            System.out.println();
        }
    }

    public void now(){
        LocalDate accountdate = LocalDate.now();

    }

    public String toString() {
        return String.format("%s %s %s %s %s ",getName(),getMiddleName(),getSurname(),getBirthday(),getEmail());
    }

    public boolean ageCondition(){

        if (mosha>13){
            return true;
        }
        return false;
    }


}
