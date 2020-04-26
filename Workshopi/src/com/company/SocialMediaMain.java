package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SocialMediaMain {
    public static void main(String[] args) {
//        Scanner useri = new Scanner(System.in);
        Useri useri1=new Useri();

        System.out.printf(" Emri: %s %n Emrimesem: %s %n Mbiemri: %s %n Birthday: %s %n Emaili: %s %n ",
                useri1.getName(),useri1.getMiddleName(),useri1.getSurname(),useri1.getBirthday(),useri1.getEmail());


      /*  Useri user = new Useri();
        user.setName(useri.nextLine());
        user.setMiddleName(useri.nextLine());
        user.setSurname(useri.nextLine());

        System.out.println("Emri: " + user.getName());
        System.out.println("MiddleName: " +user.getMiddleName());
        System.out.println("Mbiemri: " + user.getSurname());*/



    }
}
