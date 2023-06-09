package hust.soict.dsai.aims.media;

public class Disc extends Media{
    int length;
    String director;
    
    
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }


    public Disc(String title, String category, String director, int length,float cost){
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
    public Disc(String title, float cost){
        super(title, cost);
    }
    public Disc(String title,String category,float cost){
            super(title, category, cost);
    }
    
    public Disc(String title){
        super(title);
    }
    
    
}
