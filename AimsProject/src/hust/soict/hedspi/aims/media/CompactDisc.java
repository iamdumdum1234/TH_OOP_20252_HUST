package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.media.Track;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added successfully!");
        }
        else {
            System.out.println("Track already exists!");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully!");
        }
        else {
            System.out.println("Track does not exist!");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (int i = 0; i < tracks.size(); i++) {
            totalLength += tracks.get(i).getLength();
        }
        return totalLength;
    }

    // - Implement play() for CompactDisc
    // Since the CompactDisc class contains a ArrayList of Tracks, each of which can be played on its own. The play() method should output some information about the CompactDisc to
    // console. Loop through each track of the arraylist and call Track's play() method
    @Override
    // plays all tracks at once
    // this makes no sense
    // but hopefully as we progress we'll see a better implementation
    public void play() {
        for (Track track : tracks) { // for each track of Track datatype in tracks arraylist (yes)
            track.play();
        }
    }
}
