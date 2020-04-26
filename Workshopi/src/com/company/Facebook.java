package com.company;


import java.util.ArrayList;

public class Facebook {
    public static ArrayList<Useri> users=new ArrayList<>();



    //metode me u regjistune facebook
    //metode me u deatkivizu
    //metode me u fshi prej facebook -> deactivate
    //duhet me pas metode e cila e shton shokun  te shoku -> e gjon facebook pastaj ki me shtu nje shok te ri

    public static void add(String name, String surname) {
        Useri item = new Useri(name, surname);
        users.add(item);
    }
}
