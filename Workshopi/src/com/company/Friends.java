package com.company;

public class Friends extends Useri{
    private int friendsNumber;
    private int allFriends;
    private int mutualFriends;
    private int followers;
    private int following;
    private int friendRequest;
    private String findFriends;
    private String suggestedFriends;
    private final int MAXFRIENDS = 5000;


    public Friends(){

    }

    public Friends(int friendsNumber, int allFriends, int mutualFriends, int followers, int following, int friendRequest, String findFriends, String suggestedFriends) {
        this.friendsNumber = friendsNumber;
        this.allFriends = allFriends;
        this.mutualFriends = mutualFriends;
        this.followers = followers;
        this.following = following;
        this.friendRequest = friendRequest;
        this.findFriends = findFriends;
        this.suggestedFriends = suggestedFriends;
    }

    public int getFriendsNumber() {
        return friendsNumber;
    }

    public void setFriendsNumber(int friendsNumber) {
        this.friendsNumber = friendsNumber;
    }

    public int getAllFriends() {
        return allFriends;
    }

    public void setAllFriends(int allFriends) {
        this.allFriends = allFriends;
    }

    public int getMutualFriends() {
        return mutualFriends;
    }

    public void setMutualFriends(int mutualFriends) {
        this.mutualFriends = mutualFriends;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFriendRequest() {
        return friendRequest;
    }

    public void setFriendRequest(int friendRequest) {
        this.friendRequest = friendRequest;
    }

    public String getFindFriends() {
        return findFriends;
    }

    public void setFindFriends(String findFriends) {
        this.findFriends = findFriends;
    }

    public String getSuggestedFriends() {
        return suggestedFriends;
    }

    public void setSuggestedFriends(String suggestedFriends) {
        this.suggestedFriends = suggestedFriends;
    }
}
