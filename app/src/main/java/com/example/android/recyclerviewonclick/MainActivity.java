package com.example.android.recyclerviewonclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

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
        viewAdapter = new PersonRecyclerViewAdapter(dataSource);
        personRecycleView.setAdapter(viewAdapter);
    }
}