package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    
    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
        }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof Track){
            Track tObj = (Track) obj;
            if (this.getTitle().equals(tObj.getTitle()) && this.getLength() == (tObj.getLength())){
                return true;
            }
        }
        return false;
    }
    
}
