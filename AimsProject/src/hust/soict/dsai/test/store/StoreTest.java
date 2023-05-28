package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Cinderella");
		
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3, dvd4, dvd5};
		store.addDigitalVideoDisc(dvdList);;
		store.removeDVD(dvd2);
		for (int i=0;i<store.getQtyItems();i++){
			System.out.println(store.getItemsInStore()[i]);
		}
	}
}