package com.example.android.recyclerviewonclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

//TODO: POINT.10 In the Activity make the Activity class implement the MyAdapter.ListItemClickListener interface and override its onListItemClick method (DONE)
public class MainActivity extends AppCompatActivity implements PersonRecyclerViewAdapter.ListItemClickListener {


    @Override
    public void onListItemClick(Person person) {
        //We have a click and an object that was clicked
        String firstName = person.getFirstName();
        String secondName = person.getSecondName();
        String programingLanguage = person.getFavoriteProgramingLanguage();
        //to keep it simple we will make a silly toast message
        Toast.makeText(MainActivity.this,
                firstName + " " + secondName + " is a " + programingLanguage + " Jedi", Toast.LENGTH_SHORT).show();


    }

    private static Person[] dataSource = FakeDataSource.dataSource();

    PersonRecyclerViewAdapter viewAdapter;
    RecyclerView personRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personRecycleView = findViewById(R.id.ma_rv_person);
        personRecycleView.setLayoutManager(new LinearLayoutManager(this));
        personRecycleView.setHasFixedSize(true);
        //TODO: POINT.11 Don’t forget when you create a new instance of adapter in the activity pass in (this) to the ListItemClickListener  param you added to the adapters constructor (see point4.) (DONE)
        viewAdapter = new PersonRecyclerViewAdapter(dataSource, this);
        personRecycleView.setAdapter(viewAdapter);
    }
}