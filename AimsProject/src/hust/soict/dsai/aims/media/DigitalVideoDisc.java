package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    
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
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
        }
    @Override
    public String toString(){
        return this.getId() + ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() +": " + this.getCost();
    }
    

}
