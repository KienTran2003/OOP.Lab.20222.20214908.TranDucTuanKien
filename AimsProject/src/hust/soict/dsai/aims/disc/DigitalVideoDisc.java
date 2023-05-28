package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private int id;
    private static int nbDigitalvideoDisc = 0;
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public double getCost() {
        return cost;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalvideoDisc++;
        this.id = nbDigitalvideoDisc;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getNbDigitalvideoDisc() {
        return nbDigitalvideoDisc;
    }
    public static void setNbDigitalvideoDisc(int nbDigitalvideoDisc) {
        DigitalVideoDisc.nbDigitalvideoDisc = nbDigitalvideoDisc;
    }
    public DigitalVideoDisc(String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalvideoDisc++;
        this.id = nbDigitalvideoDisc;
    }
    public DigitalVideoDisc(String title, String category, String director, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalvideoDisc++;
        this.id = nbDigitalvideoDisc;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalvideoDisc++;
        this.id = nbDigitalvideoDisc;
    }

    public String toString(){
        return this.id + ". DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length +": " + this.cost;
    }
    public void setTitle(String title){
        this.title  = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

}