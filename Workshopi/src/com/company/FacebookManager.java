package com.company;

import java.util.ArrayList;

public class FacebookManager {
    private ArrayList<Useri> UserNumber = new ArrayList<>();

    public  void useri(Useri user) {
        UserNumber.add(user);
    }


    public  void testAllUsers() {
        for (Useri useri : UserNumber) {

            System.out.printf("%s %s",useri, useri.ageCondition() ? "Mund te hapet llogaria" : "Nuk mund te hapet llogaria me kete moshe");
        }
    }

}