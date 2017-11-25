package com.example.android.recyclerviewonclick;

/**
 * Created by peterpomlett on 25/11/2017.
 */

public class FakeDataSource {

    //Just some fake data to show in theRecyclerView
    public static Person[] dataSource (){
        Person personOne = new Person("Sally","Smith","Java");
        Person personTwo = new Person("Peter","jones","ObjectiveC");
        Person personThree = new Person("Fred","Cooper","Python");
        Person personFour = new Person("Sara","Stone","Haskell");
        Person personFive = new Person("Bert","Shore","C++");
        Person personSix = new Person("Wendy","Parkinson","Swift");
        Person personSeven = new Person("bob","Smith","Ruby");
        Person personEight = new Person("Dave","Campbel","Scala");
        Person personNine = new Person("Trish","Older","javascript");
        Person personTen = new Person("Sue","Digger","C");
        Person personEleven = new Person("bob","Hunt","PHP");
        Person personTwelve = new Person("Clive","Butcher","Go");
        Person a[]={personOne,personTwo,personThree,personFour,personFive,personSix,personSeven,personEight,personNine,personTen,personEleven,personTwelve};
        return a;
    }


}
