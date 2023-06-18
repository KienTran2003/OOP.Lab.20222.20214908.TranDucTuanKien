package hust.soict.dsai.aimsprojects.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    
    public String getArtist() {
        return artist;
    }

    

    public CompactDisc(String title, String category, float cost){
        super(title, category, cost);

    }
    public CompactDisc(String title, float cost){
        super(title, cost);
    }
    public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks){
        super(title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
        
    }
    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
            System.out.println("You have added a track.");
        } else {
            System.out.println("This track has been already added");
        }
    }
    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
            System.out.println("Your track has been removed");
        } else {
            System.out.println("This track is not in list");
        }
    }
    public int getLength(){
        return tracks.size();

    }
    @Override
//    public void play(){
//        System.out.println("CD artist: " + this.artist);
//		System.out.println("Total length: " + this.getLength());
//        for (Track track: tracks){
//            track.play();
//        }
//    }
    public void play() throws PlayerException {
        if(this.getLength() > 0) {
            java.util.Iterator iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
                nextTrack = (Track) iter.next();
                try {
                    nextTrack.play();
                }catch(PlayerException e) {
                    throw e;
                }
            }
        }else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Compact Disc: " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getCost();
    }



    public static void main(String[] args){
        CompactDisc cp = new CompactDisc("First", "Chill", 2);
        cp.addTrack(new Track("Kien dz", 1));
        System.out.println(cp.getLength());
    }

}