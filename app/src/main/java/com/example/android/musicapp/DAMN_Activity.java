package com.example.android.musicapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DAMN_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        ArrayList<Album> album = new ArrayList<Album>();

        album.add(new Album("Kendrick Lamar", "BLOOD."));
        album.add(new Album("Kendrick Lamar", "DNA."));
        album.add(new Album("Kendrick Lamar", "YAH."));
        album.add(new Album("Kendrick Lamar", "ELEMENT."));
        album.add(new Album("Kendrick Lamar", "FEEL."));
        album.add(new Album("Kendrick Lamar FT. Rihanna", "LOYALTY."));
        album.add(new Album("Kendrick Lamar", "PRIDE."));
        album.add(new Album("Kendrick Lamar", "HUMBLE."));
        album.add(new Album("Kendrick Lamar", "LUST."));
        album.add(new Album("Kendrick Lamar FT. Zacardi", "LOVE."));
        album.add(new Album("Kendrick Lamar FT. U2", "XXX."));
        album.add(new Album("Kendrick Lamar", "FEAR."));
        album.add(new Album("Kendrick Lamar", "GOD."));
        album.add(new Album("Kendrick Lamar", "DUCKWORTH."));

        AlbumAdapter adapter = new AlbumAdapter(this, album);
        ListView listView = (ListView) findViewById(R.id.album_list);
        listView.setAdapter(adapter);
    }
}
