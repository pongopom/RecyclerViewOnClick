package com.example.android.recyclerviewonclick;

/**
 * Created by peterpomlett on 25/11/2017.
 */

public class Person {
    private String firstName;
    private String secondName;
    private String favoriteProgramingLanguage;

    public Person(String firstName, String secondName, String favoriteProgramingLanguage) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.favoriteProgramingLanguage = favoriteProgramingLanguage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFavoriteProgramingLanguage() {
        return favoriteProgramingLanguage;
    }
}
