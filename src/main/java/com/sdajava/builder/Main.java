package com.sdajava.builder;

public class Main {

    public static void main(String[] args) {

        System.out.println(getUser());

    }

    public static User getUser(){
        return new User.UserBuilder("Jan","Kowalski")
            .age(20)
            .address("adres")
            .build();

    }
}
