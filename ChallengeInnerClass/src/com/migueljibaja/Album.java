package com.migueljibaja;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    private SongList songList;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songList = new SongList();
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (int i = 0; i < this.songs.size() ; i++) {
                Song checkedSong = this.songs.get(i);
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber -1;
            if (index >=0 && index < this.songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }


    }

    public boolean addSong(String title, Double duration){
        return this.songList.add(new Song(title, duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList ) {
        Song checkedSong = this.songList.findSong(trackNumber);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songList.findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + "is not in this album");
        return false;
    }




}
