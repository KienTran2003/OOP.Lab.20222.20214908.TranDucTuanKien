package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    //overloading
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    DigitalVideoDisc tmp = new DigitalVideoDisc(dvd1.getTitle(), dvd1.getCategory(), dvd1.getDirector(), dvd1.getLength(), dvd1.getCost());
	    Disc castDVD1 = dvd1;
        Disc castDVD2 = dvd2;
        // castDVD1.setTitle(dvd2.getTitle());
	    // castDVD1.setCategory(dvd2.getCategory());
	    // castDVD1.setDirector(dvd2.getDirector());
	    // castDVD1.setLength(dvd2.getLength());
	    // castDVD1.setCost(dvd2.getCost());
	    // castDVD2 .setTitle(tmp.getTitle());
	    // castDVD2 .setCategory(tmp.getCategory());
	    // castDVD2 .setDirector(tmp.getDirector());
	    // castDVD2 .setLength(tmp.getLength());
	    // castDVD2 .setCost(tmp.getCost());
	   	}

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    
}
