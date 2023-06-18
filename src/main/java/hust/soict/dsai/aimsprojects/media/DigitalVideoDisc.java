package hust.soict.dsai.aimsprojects.media;

public class DigitalVideoDisc extends Disc implements Playable {
    
    public DigitalVideoDisc(String title, String category,String director, int length,float cost){
        super(title, category,director,length, cost);
    }
    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title){
        super(title);
    }
    public DigitalVideoDisc(String title, float cost){
        super(title, cost);
    }
    @Override
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive");
        }
    }
    @Override
    public String toString(){
        return this.getId() + ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() +": " + this.getCost();
    }
    

}
