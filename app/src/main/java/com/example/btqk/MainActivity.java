package com.example.btqk;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.activity.EdgeToEdge;

import org.apache.commons.compress.harmony.pack200.IntList;

public class MainActivity extends AppCompatActivity {

    private IntList movie;
    private IntList movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView;
        MovieAdapter movieAdapter;
        List<Movie> movieList;
        List<Movie> filteredMovieList;
        SearchView searchView;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            listView = findViewById(R.id.listView);
            searchView = findViewById(R.id.searchView);
            movieList = new ArrayList<>();
            filteredMovieList = new ArrayList<>();


            movieList.add(new Movie("Joker", "Action, ", 2010));
            movieList.add(new Movie("The Dark Knight", "Action", 2008));



            filteredMovieList.addAll(movieList);


            movieAdapter = new MovieAdapter(this, filteredMovieList);
            listView.setAdapter((ListAdapter) movieAdapter);


            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }


            });
        }

    }


