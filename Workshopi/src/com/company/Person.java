package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Person extends Facebook{
    static Scanner useri=new Scanner(System.in);
    private String name;
    private String middleName;
    private String surname;
    private LocalDate birthday;
    private String email;

    public Person(){
        setName(useri.nextLine());
        setMiddleName(useri.nextLine());
        setSurname(useri.nextLine());
        setBirthday(useri.nextLine());
        setEmail(useri.nextLine());

    }

    public Person(String name, String middleName, String surname, LocalDate birthday, String email) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if ( validimi(name) ){
            this.name = name;
        }
        else{
            this.name = "EMRI DUHET TE PLOTSOHET";
        }
    }

    public String getMiddleName() {
        return middleName;

    }

    public void setMiddleName(String middleName) {
        if ( validimi(middleName) ){
            this.middleName = middleName;
        }
        else{
            this.middleName = "EMRI I MESEM DUHET TE PLOTSOHET";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(validimi(surname)){
            this.surname = surname;
        }
        else{
            this.surname = "MBIEMRI DUHET TE PLOTSOHTE";

        }
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
//        if (birthday  LocalDate.parse("2007-04-25")){
//            this.birthday = birthday;
//        } else {
//            System.out.println("Nuk e keni moshen adekuate per te hapur nje llogari ne Facebook");
//        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validimi(String Val) {

        return Val != "" && Val.trim().length()>1;


    }
}
