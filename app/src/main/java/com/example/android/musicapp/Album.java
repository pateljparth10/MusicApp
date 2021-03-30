package com.example.android.musicapp;

public class Album {
        private String mArtist;
        private String mSong;
        private int mImageResourceID = noImage;
        private static final int noImage = -1;

        public Album(String artist, String song, int ImageResourceID){
            mArtist = artist;
            mSong = song;
            mImageResourceID = ImageResourceID;
        }
        public Album(String artist, String song){
            mArtist = artist;
            mSong = song;
        }

        public String getArtist(){
            return mArtist;
        }
        public String getSong(){
            return mSong;
        }

        public int getImageResourceID(){
            return mImageResourceID;
        }
        public boolean hasImage() {
            return mImageResourceID != noImage;
        }
}
