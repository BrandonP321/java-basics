package linkedLists.src;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedList;

 class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    
    public boolean addSong(String title, double duration) {
        this.songs.add(new Song(title, duration));
        return true;
    }
    
    public Song findSong(String title) {
        Iterator<Song> iter = this.songs.iterator();
        
        while (iter.hasNext()) {
            Song song = iter.next();
            if (song.getTitle() == title) {
                return song;
            } 
        }
        
        return null;
    }
    
    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        if (this.songs.size() < track) {
            return false;
        }
        
        playlist.add(this.songs.get(track));
        return true;
    }
    
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        ListIterator<Song> iter = this.songs.listIterator();
        
        int index = 0;
        while (iter.hasNext()) {
            if (iter.next().getTitle() == title) {
                return addToPlayList(index, playlist);
            }
            index += 1;
        }
        
        return false;
    }
}