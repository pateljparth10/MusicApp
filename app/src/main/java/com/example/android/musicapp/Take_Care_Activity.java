package com.example.android.musicapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Take_Care_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Drake", "Over My Dead Body"));
        albums.add(new Album("Drake", "Shot For Me"));
        albums.add(new Album("Drake", "Headlines"));
        albums.add(new Album("Drake FT. The Weekend", "Crew Love"));
        albums.add(new Album("Drake FT. Rihanna", "Take Care"));
        albums.add(new Album("Drake", "Marvins Room"));
        albums.add(new Album("Drake FT. Kendrick Lamar", "Buried Alive Interlude"));
        albums.add(new Album("Drake", "Under Ground Kings"));
        albums.add(new Album("Drake FT. Birdman", "We'll Be Fine"));
        albums.add(new Album("Drake FT. Nicki Minaj", "Make Me Proud"));
        albums.add(new Album("Drake FT. Rick Ross", "Lord Knows"));
        albums.add(new Album("Drake", "Cameras"));
        albums.add(new Album("Drake", "Doing It Wrong"));
        albums.add(new Album("Drake FT. Lil Wayne, Andre 3000", "The Real Her"));
        albums.add(new Album("Drake", "Look What You've Done"));
        albums.add(new Album("Drake", "HYFR"));
        albums.add(new Album("Drake", "Practice"));
        albums.add(new Album("Drake", "The Ride"));
        albums.add(new Album("Drake FT. Lil Wayne", "The Motto"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        ListView listView = (ListView) findViewById(R.id.album_list);
        listView.setAdapter(adapter);
    }
}
