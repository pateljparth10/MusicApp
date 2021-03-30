package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class AlbumAdapter extends ArrayAdapter<Album> {
    public AlbumAdapter (Activity context, ArrayList<Album> Album){
        super(context,0,Album);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Album currentAlbum = getItem(position);

        TextView artistTextView = (TextView)listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentAlbum.getArtist());

        TextView songTextView = (TextView)listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentAlbum.getSong());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentAlbum.hasImage()) {
            iconView.setImageResource(currentAlbum.getImageResourceID());
            iconView.setVisibility(View.VISIBLE);
        } else{
            iconView.setVisibility(View.GONE);
        }
        return listItemView;

    }

}




