package com.example.thesportsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView; // Adapter view.
    private List<Sport> sportList; // Da
    private CustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        sportList = new ArrayList<>();

        Sport Sport_1 = new Sport(R.drawable.football, "Football");
        Sport Sport_2 = new Sport(R.drawable.basketball, "Basketball");
        Sport Sport_3 = new Sport(R.drawable.volley, "Volleyball");
        Sport Sport_4 = new Sport(R.drawable.tennis, "Tennis");
        Sport Sport_5 = new Sport(R.drawable.ping, "Ping Pong.");

        sportList.add(Sport_1);
        sportList.add(Sport_2);
        sportList.add(Sport_3);
        sportList.add(Sport_4);
        sportList.add(Sport_5);

        myCustomAdapter = new CustomAdapter(sportList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);
    }
}
