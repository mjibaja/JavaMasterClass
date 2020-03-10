package com.migueljibaja;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        Album album = new Album("Appetite for Destruction","Guns n Roses");
        album.addSong("Welcome to the jungle",4.3);
        album.addSong("It's so easy",3.8);
        album.addSong("Nightrain",4.1);
        album.addSong("Out ta get me",4.0);
        album.addSong("Mr. Browstone",4.4);
        album.addSong("Paradise City",4.3);
        album.addSong("My Michelle",3.4);
        album.addSong("Think about you",4.1);
        album.addSong("Sweet child of mine",4.2);
        albums.add(album);

        album =  new Album("For those about to rock","AC/DC");
        album.addSong("Song one",5.44);
        album.addSong("Song two",3.12);
        album.addSong("Song three",4.3);
        album.addSong("Song four",5.1);
        album.addSong("Song five",3.81);
        album.addSong("Song six",4.21);
        album.addSong("Song seven",4.3);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("My Michelle",playList);
        albums.get(0).addToPlayList("Welcome to the jungle",playList);
        albums.get(0).addToPlayList("Paradise City",playList);
        albums.get(1).addToPlayList(7,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList);

        play(playList);







    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size()==0){
            System.out.println("No songs here");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " +listIterator.next().getTitle());
                    }else {
                        System.out.println("End of the list");
                        forward = false;
                    }

                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing" + listIterator.previous().getTitle());
                    }else{
                        System.out.println("We are at the start");
                        forward = true;
                    }

                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().getTitle());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().getTitle());
                            forward = true;
                        }else{
                            System.out.println("The end of the list");
                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                case 6:
                    if (playList.size()>0){
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getTitle());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().getTitle());
                        }
                    }
                    break;

            }
        }

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
        System.out.println("=======================");
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playist\n" +
                "5 - print available actions.\n" +
                "6 - remove current song\n");

    }



}

