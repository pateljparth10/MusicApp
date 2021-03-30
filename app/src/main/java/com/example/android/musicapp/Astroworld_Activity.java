package com.example.android.musicapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Astroworld_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Travis Scott","STARGAZING"));
        albums.add(new Album("Travis Scott","CAROUSEL"));
        albums.add(new Album("Travis Scott","SICKO MODE"));
        albums.add(new Album("Travis Scott","R.I.P. SCREW"));
        albums.add(new Album("Travis Scott","STOP TRYING TO BE GOD"));
        albums.add(new Album("Travis Scott","NO BYSTANDERS"));
        albums.add(new Album("Travis Scott","SKELETONS"));
        albums.add(new Album("Travis Scott","WAKE UP"));
        albums.add(new Album("Travis Scott","5% TINT"));
        albums.add(new Album("Travis Scott","NC-17"));
        albums.add(new Album("Travis Scott","ASTROTHUNDER"));
        albums.add(new Album("Travis Scott","YOSEMITE"));
        albums.add(new Album("Travis Scott","CAN'T SAY"));
        albums.add(new Album("Travis Scott","WHO? WHAT!"));
        albums.add(new Album("Travis Scott","BUTTERFLY EFFECT"));
        albums.add(new Album("Travis Scott","HOUSTONFORNICATION"));
        albums.add(new Album("Travis Scott","COFFEE BEAN"));

        AlbumAdapter adapter = new AlbumAdapter(this,albums);
        ListView listView = (ListView) findViewById(R.id.album_list);
        listView.setAdapter(adapter);
    }
}
